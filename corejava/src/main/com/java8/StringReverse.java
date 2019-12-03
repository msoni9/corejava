package main.com.java8;

import java.util.Scanner;

public class StringReverse {

	static int i = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		int count = 0;
		char[] charArray = A.toCharArray();
		for (i = 0; i < charArray.length / 2; i++) {
			java.util.function.Predicate<Character> p = a -> charArray[i] == charArray[charArray.length - i - 1];
			if (p.test(charArray[i])) {
				count++;
			}
		}

		System.out.println((count == A.length() / 2) ? "Yes" : "No");

	}

}
