package main.com.java8;

import java.util.Optional;

public class WorkingOptional {

	public static void main(String args[]) {
		WorkingOptional java8Tester = new WorkingOptional();
		Integer value1 = null;
		Integer value2 = new Integer(10);

		Optional<Integer> a = Optional.ofNullable(value2);
		System.out.println(a);

		Optional<Integer> b = Optional.of(value2);
		System.out.println(b);
		System.out.println(WorkingOptional.sum(a, b));
	}

	private static int sum(Optional<Integer> a, Optional<Integer> b) {

		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

		Integer value1 = a.orElse(new Integer(0));

		Integer value2 = b.get();
		return value1 + value2;
	}

}
