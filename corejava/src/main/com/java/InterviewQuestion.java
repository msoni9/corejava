package main.com.java;

import java.util.HashSet;

public class InterviewQuestion {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		System.out.println(hset.add("Mayank"));
		System.out.println(hset.add("Mayank"));
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);

	}

}
