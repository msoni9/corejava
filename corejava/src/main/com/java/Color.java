package main.com.java;

public enum Color {

	RED, GREEN, BLUE;

	// enum constructor called separately for each
	// constant
	private Color() {
		System.out.println("Constructor called for : " + this.toString());
	}

	// Only concrete (not abstract) methods allowed
	public void colorInfo() {
		System.out.println("Universal Color");
	}
}
