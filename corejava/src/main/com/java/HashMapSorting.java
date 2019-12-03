package main.com.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapSorting {

	/**
	 * We can sort hashMap Key sort by using treeMap, we can sort hashMap value
	 * sort by using comparator
	 */

	public static void main(String args[]) {
		HashMap<String, String> codenames = new HashMap<>();

		codenames.put("JDK 1.1.4", "Sparkler");
		codenames.put("J2SE 1.2", "Playground");
		codenames.put("J2SE 1.3", "Kestrel");
		codenames.put("J2SE 1.4", "Merlin");
		codenames.put("J2SE 5.0", "Tiger");
		codenames.put("Java SE 6", "Mustang");
		codenames.put("Java SE 7", "Dolphin");

		Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> e1, Entry<String, String> e2) {
				String v1 = e1.getValue();
				String v2 = e2.getValue();
				return v1.compareTo(v2);
			}
		};

		System.out.println(codenames);

	}
}
