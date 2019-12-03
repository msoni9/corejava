package main.com.java;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ComparableCustomisedSorting {

	public static void main(String args[]) {

		ArrayList<Employeee> e = new ArrayList<Employeee>();
		BiFunction<String, Integer, Employeee> bii = (firstName, age) -> new Employeee(firstName, age);

		e.add(bii.apply("dom", 25));
		e.add(bii.apply("tom", 26));
		e.add(bii.apply("harry", 27));

		System.out.println(e);
	}
}
