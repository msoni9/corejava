package main.com.java;

public class Parent {

	public void go() {
		doStuff();
	}

	public void doStuff() {
		go();
	}
}
