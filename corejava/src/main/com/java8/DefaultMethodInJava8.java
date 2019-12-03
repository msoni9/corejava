package main.com.java8;
/*
 * to call default method interfaceName.super.methodName
 */

/*
 * Note - if we have to interface which have same method then while implementing them it would give compile
 * time error.
 * 
 * if we implement any interface in java 8. then no need to implement it's methods.
 */
interface left {
	default void m1() {
		System.out.println("Method 1");
	}
}

interface right {
	default void m1() {
		System.out.println("Method 2");
	}
}

// public class DefaultMethodInJava8 implements right, left {
//
// }
