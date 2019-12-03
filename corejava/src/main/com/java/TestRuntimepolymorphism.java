package main.com.java;

class Animalss {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}

}

class Horse extends Animalss {

	public void eat() {

		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}

	public void buck() {
	}
}

public class TestRuntimepolymorphism {
	public static void main(String[] args) {
		Animalss a = new Animalss();
		Animalss b = new Horse(); // Animal ref, but a Horse object
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
		/*
		 * complie time error
		 */
		// b.buck
	}
}
