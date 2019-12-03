package main.com.java;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		//				    	StringBuffer str = new StringBuffer();
		//				    	long count =0;
		//				    	
		//				    	for(int j=0; j<n ; j++){
		//				    		str.append(s);
		//				    	}
		//				    	char[] charArray= new char[str.length()];
		//				    	str.getChars(0, str.length(), charArray, 0);
		//				    	
		//				    	for(int i=0; i< str.length() ; i++){
		//				    		if(charArray[i] == 'a'){
		//								count++;
		//				    		}
		//				    	}
		//				    	return count;

		//		StringBuilder str = new StringBuilder();
		//		long count = 0;
		//		char[] stringArray = s.toCharArray();
		//		long length = stringArray.length;
		//		long remainder =n%length;
		//		long quotient = n/length;
		//		for(int j=0; j<quotient ; j++){
		//			str.append(s);
		//
		//		}
		//		for(int i=0; i<remainder; i++){
		//			str.append(stringArray[i]);
		//		}
		//
		//		char[] bufferArray= new char[str.length()];
		//		str.getChars(0, str.length(), bufferArray, 0);
		//		for(int i=0; i< bufferArray.length ; i++){
		//			if(bufferArray[i] == 'a'){
		//				count++;
		//			}
		//		}
		//		return count;

		//Scanner in = new Scanner(System.in);
		// String s = in.next();
		// long n = in.nextLong();
		long count =0;
		for(char c : s.toCharArray())
			if(c == 'a')
				count++;

		long factor = (n/s.length());
		long rem = (n%s.length());
		count =  factor*count  ;
		for(int i=0;i<rem;i++)
			if(s.charAt(i)=='a')
				count++;        

		return count;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);
		System.out.println(result);

		scanner.close();
	}

}
