package main.com.java;

//class Popcorn {
//	public void pop() {
//		System.out.println("popcorn");
//	}
//}

public class Child {

	private static String s;

	public static void main(String[] args) {
		try {
			s.concat("Mayank");

			System.out.println("soni");
		} catch (RuntimeException e) {
			throw new NullPointerException();

		}
	}
	// Popcorn p = new Popcorn() {
	// public void sizzle() {
	// System.out.println("anonymous sizzling popcorn");
	// }
	//
	// public void pop() {
	// System.out.println("anonymous popcorn");
	// }
	// };
	//
	// public void popIt() {
	// p.pop(); // OK, Popcorn has a pop() method
	// // p.sizzle(); // Not Legal! Popcorn does not have sizzle()
	// }
}
