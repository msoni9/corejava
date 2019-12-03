package main.com.java;

import java.util.Arrays;

/**
 * List and ArrayList have same implementation
 * 
 * @author mayank.soni
 *
 * @param <E>
 */

public class MyList<E> {

	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object element[];

	public MyList() {
		element = new Object[DEFAULT_CAPACITY];
	}

	public void add(E e) {
		if (size == element.length) {
			ensureCapacity();
		}
	}

	private void ensureCapacity() {
		int newIncreasedCapacity = element.length * 2;
		element = Arrays.copyOf(element, newIncreasedCapacity);

	}

	public E get(int index) {
		// if index is negative or greater than size of size, we throw
		// Exception.
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) element[index]; // return value on index.
	}

	public Object remove(int index) {
		// if index is negative or greater than size of size, we throw
		// Exception.
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}

		Object removedElement = element[index];
		for (int i = index; i < size - 1; i++) {
			element[i] = element[i + 1];
		}
		size--;

		return removedElement;
	}

	public void display() {
		System.out.print("Displaying list : ");
		for (int i = 0; i < size; i++) {
			System.out.print(element[i] + " ");
		}
	}

	public static void main(String... a) {
		MyList<Integer> list = new MyList<Integer>();
		// Add elements in custom ArrayList
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);

		// Display custom ArrayList
		list.display();
		System.out.println("\nelement at index in custom ArrayList > " + 1 + " = " + list.get(1));

		// Remove element from custom ArrayList
		System.out.println("element removed from index " + 1 + " = " + list.remove(1));

		// Again display custom ArrayList
		System.out.println("\nlet's display custom ArrayList again after removal at index 1");

		list.display();

		// list.remove(11); //will throw IndexOutOfBoundsException, because
		// there is no element to remove on index 11.
		// list.get(11); //will throw IndexOutOfBoundsException, because
		// there
		// is no element to get on index 11.
	}

}
