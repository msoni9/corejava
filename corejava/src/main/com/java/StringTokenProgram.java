package main.com.java;

import java.util.Scanner;

public class StringTokenProgram {
	// [,?']+

	public static void main(String[] args) {
		String regex ="[!,?._'@]+" ;
		//String regex1 ="[']+";
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String replaceAll = s.replaceAll(regex, "");
		System.out.println(replaceAll);
		String[] split = replaceAll.split(" ");
		System.out.println(split.length);
		for(int i=0; i< split.length ; i++){
			System.out.println(split[i]);
		}
		
		
		// Write your code here.
//		String[] split = s.split(" ");
//		if(s.contains("'")){
//			System.out.println(split.length+1);
//		}else{
//			System.out.println(split.length);
//		}
//		for(int i=0; i<split.length ; i++){
//			if(split[i].contains("'"))
//				System.out.println(split[i].replaceAll(regex, "\n"));
//			else{
//				System.out.println(split[i].replaceAll(regex, ""));
//			}
//
//		}

		scan.close();


	}
}
