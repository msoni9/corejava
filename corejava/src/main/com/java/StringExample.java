package main.com.java;

public class StringExample {

	/**
	 * when a + is used for concatenation see how many steps are involved:
	 * 
	 * 
	 * A StringBuffer object is created string1 is copied to the newly created
	 * StringBuffer object The “*” is appended to the StringBuffer
	 * (concatenation) The result is converted to back to a String object. The
	 * string1 reference is made to point at that new String. The old String
	 * that string1 previously referenced is then made null.
	 * 
	 * 
	 * Note : hashCode would be same but object has been created in differenct
	 * location , hence == returns false
	 */

	public static void main(String[] args) {
		String s1 = "Mayank";
		String s2 = "Soni";
		String s4 = "MayankSoni";
		System.out.println(s4.hashCode());
		String s3 = s1 + s2;
		String s5 = s1.concat(s2);
		System.out.println(s3.hashCode());
		System.out.println(s3 == s4); // reference or location or address
		System.out.println(s3 == s5);
		System.out.println(s3.equals(s4)); // content or value

	}

}
