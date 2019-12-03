package main.com.java;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MatchingSocks {


	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		Set<Integer> machingSet = new HashSet<Integer>();

		int pairs = 0;

		for(int i=0 ; i<ar.length; i++){
			if(!machingSet.contains(ar[i])){
				machingSet.add(ar[i]);
			}else{
				pairs++;
				machingSet.remove(ar[i]);
			}
		} System.out.println(pairs);
		return pairs;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		scanner.close();
	}

}
