package main.com.java;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		char[] charA = a.toUpperCase().toCharArray();
		java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
		for (int i = 0; i < charA.length; i++) {
			if (map.containsKey(charA[i])) {
				map.put(charA[i], (map.get(charA[i]) + 1));
				// int count = map.containsKey(split[i]) ? map.get(split[i]) :
				// 0;
				// map.put(split[i], count + 1);
			} else {
				map.put(charA[i], 1);
			}

		}

		char[] charB = b.toUpperCase().toCharArray();
		for (int i = 0; i < charA.length; i++) {
			if (map.containsKey(charB[i])) {
				Integer count = map.get(charB[i]);
				if (count == 0) {
					return false;
				} else {
					count--;
					map.put(charB[i], count);
				}
			} else {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();

		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
