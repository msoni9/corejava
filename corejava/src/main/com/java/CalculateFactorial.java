package main.com.java;

import java.util.HashMap;
import java.util.Map;

public class CalculateFactorial {

	public static Map<Integer, Integer> hashMap = new HashMap<>();
	static int factorial = 1;
	public static int value = 0;

	public static void main(String args[]) {

		int number = 5; // It is the number to calculate factorial
		int factorial2 = factorial(number);
		System.out.println(factorial);
		number = 8;
		int factorial3 = factorial(number);
		System.out.println(factorial3);
	}

	private static int factorial(int number) {
		HashMap<Integer, Integer> map = new HashMap<>();
		if (number == 0) {
			return 1;
		}
		if (map.containsKey(number)) {
			return map.get(number);
		}
		if (number > 1 && map.size() < number) {
			for (int i = 1; i <= number; i++) {
				factorial = factorial * i;
				map.put(i, factorial);
			}
			return factorial;
		} else {
			int a = map.get(map.size()) * factorial(number - 1);
			return a;
		}

	}

}
