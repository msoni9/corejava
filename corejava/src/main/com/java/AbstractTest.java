package main.com.java;

abstract class AbstractTest {
	static int i;

	public void parentShow() {
		System.out.println(this.hashCode());
	}

	public void demo() {
		System.out.println("I'm abstract class");
	}
}
