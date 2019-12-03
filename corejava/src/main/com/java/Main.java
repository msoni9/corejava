package main.com.java;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {

	public static int processArray(ArrayList<Integer> array) {
		/*
		 * Modify this function to process `array` as indicated in the question.
		 * At the end, return the appropriate value.
		 *
		 * Please create appropriate classes, and use appropriate data
		 * structures as necessary.
		 *
		 * Do not print anything in this method
		 *
		 * Submit this entire program (not just this function) as your answer
		 */

		Map<Integer, ArrayList<Integer>> hashMap = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> tempList = null;

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) % 2 == 0) {
				arrayList.add(array.get(i));
			} else {
				if (arrayList.size() >= 3) {
					tempList = new ArrayList<>(arrayList);
					hashMap.put(tempList.size(), tempList);
				}
				arrayList.clear();
			}
		}
		if (arrayList.size() >= 3) {
			tempList = new ArrayList<>(arrayList);
			hashMap.put(tempList.size(), tempList);
		}

		return hashMap.size();
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int num = in.nextInt();
			if (num < 0)
				break;
			arrayList.add(new Integer(num));
		}
		int result = processArray(arrayList);
		System.out.println(result);
	}

}
