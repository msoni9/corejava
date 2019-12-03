package main.com.java;

public class MyHashSet<T> {

	private static final Integer INITIAL_CAPACITY = 1 << 4; // 16

	private Node<T>[] buckets;

	private int size;

	public MyHashSet(final int capacity) {
		this.buckets = new Node[capacity];
		this.size = 0;
	}

	public MyHashSet() {
		this(INITIAL_CAPACITY);
	}

	// public void add(T t) {
	// int index = hashCode(t) % buckets.length;
	//
	// Node bucket = buckets[index];
	//
	// Node<T> newNode = new Node<>(t);
	//
	// if (bucket == null) {
	// buckets[index] = newNode;
	// size++;
	// return;
	// }
	//
	// while (bucket.next != null) {
	// if (bucket.data.equals(t)) {
	// return;
	// }
	// bucket = bucket.next;
	// }
	//
	// // add only if last element doesn't have the value being added
	// if (!bucket.data.equals(t)) {
	// bucket.next = newNode;
	// size++;
	// }
	// }

}
