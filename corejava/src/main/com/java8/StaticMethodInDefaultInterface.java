package main.com.java8;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * to static method use interface.staticMethodName
 */

interface inter {
	public static int sum(int a, int b) {
		return a + b;
	}
}

public class StaticMethodInDefaultInterface implements inter {

	public static void main(String args[]) {
		System.out.println(inter.sum(10, 20));
	}
}
