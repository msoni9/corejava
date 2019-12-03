package main.com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetImplemtation {

	public static void main(String args[]) {
		HashSet<String> hashset = new HashSet<>();
		System.out.println(hashset.add("Mayank"));
		System.out.println(hashset.add("Mayank"));
		hashset.add("Mayank");
		hashset.add("Mayank");
		hashset.add(null);
		hashset.add(null);

		System.out.println(hashset);

		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		linkedhashset.add("Sujay");
		linkedhashset.add("Mayank");
		linkedhashset.add("Aayush");
		linkedhashset.add(null);
		linkedhashset.add(null);

		System.out.println(linkedhashset);

		ArrayList<String> arraylist = new ArrayList<>();
		System.out.println(arraylist.add("Mayank"));
		System.out.println(arraylist.add("Mayank"));
		arraylist.add("Mayank");
		arraylist.add("Mayank");
		arraylist.add(null);
		arraylist.add(null);

		System.out.println(arraylist);

		TreeSet<String> treeset = new TreeSet<>();
		treeset.add(new String("Mayank"));
		treeset.add(null);
		System.out.println(treeset);

	}

}
