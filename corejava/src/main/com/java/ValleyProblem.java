package main.com.java;

import java.io.IOException;
import java.util.Scanner;

public class ValleyProblem {

	//	String[] split = s.split("");
	//	for(int i=0; i<charArray.length ; i++){
	//		System.out.println(charArray[i]);
	//	}

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		int up = 0;
		int seaLevel = 0;
		char[] charArray = s.toCharArray();
		for(int i=0; i<charArray.length ; i++){
			if(charArray[i] == 'U'){
				up++;
				if(up ==0){
					seaLevel++;
				}
			}else{
				up--;
			}
		}
		return seaLevel;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		System.out.println(result);

		scanner.close();
	}

}
