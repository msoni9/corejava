package main.com.java;

import java.io.IOException;
import java.util.Scanner;

public class ArrayRotation {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		// int[] b = new int[a.length];
		int temp = 0;
		while (d > 0) {
			temp = a[0];
			for (int i = 0; i < a.length; i++) {

				if (i + 1 < a.length) {
					a[i] = a[i + 1];
				} else {
					a[a.length - 1] = temp;
				}
			}

			/*
			 * for(int k=0; k<a.length; k++){ a[k] = b[k]; }
			 */

			d--;
		}

		return a;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}

		scanner.close();
	}

}
