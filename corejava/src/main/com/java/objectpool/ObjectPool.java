package main.com.java.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class ObjectPool<T> {

	private ConcurrentLinkedQueue<T> pool;

	private ScheduledExecutorService executorService;

	public ObjectPool(final int minObj) {
		initialize(minObj);
	}

	private void initialize(int minObj) {
		pool = new ConcurrentLinkedQueue<T>();
		for (int i = 0; i < minObj; i++) {
			pool.add(createObj());
		}
	}

	protected abstract T createObj();

	public ObjectPool(final int minObj, final int maxObjects, final long validationInterval) {
		initialize(minObj);

		executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {

				int size = pool.size();

				if (size < minObj) {
					int sizeToBeAdded = minObj + size;
					for (int i = 0; i < sizeToBeAdded; i++) {
						pool.add(createObj());
					}
				} else if (size > maxObjects) {
					int sizeToBeRemoved = size - maxObjects;
					for (int i = 0; i < sizeToBeRemoved; i++) {
						pool.poll();
					}
				}

			}
		}, validationInterval, validationInterval, null);
	}

	public T borrowObject() {
		T object;
		if ((object = pool.poll()) == null) {
			object = createObj();
		}
		return object;
	}

	public void returnObject(T object) {
		if (object == null) {
			return;
		}
		this.pool.offer(object);
	}

	public void shutdown() {
		if (executorService != null) {
			executorService.shutdown();
		}
	}

}
