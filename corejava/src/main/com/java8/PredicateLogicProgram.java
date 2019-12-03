package main.com.java8;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateLogicProgram {

	public static void main(String args[]) {
		String[] names = { "Sunny", "Kajal", "Mallika", "Katrina", "Kareena" };
		Predicate<String> startsWithK = s -> s.charAt(0) == 'K';

		System.out.println("Name should starts with alphabet k:");
		for (String nameStartsWithK : names) {
			if (startsWithK.test(nameStartsWithK)) {
				System.out.println(nameStartsWithK);
			}
		}

		int a[] = { 1, 2, 3, 4, 5, 8, 12, 14, 20, 19 };
		IntPredicate p1 = i -> i > 10;
		IntPredicate p2 = i -> i % 2 == 0;
		System.out.println("Number is greater than 10");
		shouldCheckEvenGreaterNumber(p1, a);
		System.out.println("Number is even");
		shouldCheckEvenGreaterNumber(p2, a);
		System.out.println("Number is Even and greater than 10");
		shouldCheckEvenGreaterNumber(p1.and(p2), a);

	}

	private static void shouldCheckEvenGreaterNumber(IntPredicate p, int[] a) {
		for (int x : a) {
			if (p.test(x)) {
				System.out.println(x);
			}
		}
	}
}
