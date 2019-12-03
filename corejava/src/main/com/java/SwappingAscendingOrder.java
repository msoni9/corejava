package main.com.java;

import java.io.IOException;
import java.util.Scanner;

public class SwappingAscendingOrder {
	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int chota =0;
		int sabseChota =0;
		int k = 0;
		int b[] = new int[arr.length];
		for(int i=0; i< arr.length ; i++){
			if(i+1<arr.length && arr[i]<arr[i+1]){
				chota= arr[i];
				if(chota>sabseChota){
					sabseChota = arr[i];
				}
				b[k] = sabseChota;
				k++;
			}
		}

		for(int j=0; j<arr.length ; j++){
			System.out.println(arr[k]);
		}

		return  k;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);

		scanner.close();
	}
}
