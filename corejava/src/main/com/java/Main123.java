package main.com.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main123 {

	public static void main(String[] args) {
		System.out.println("" + Main123.f(3));
		 Map<Integer,List<Integer>> x = new HashMap<>();
	}

	public static Optional<Integer> f(int i) {
		return i % 2 == 0 ? Optional.empty() : Optional.of(i);
	}

}
