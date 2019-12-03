package main.com.java.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	/*
	 * Approach 1st
	 */
	@Test
	public void testExpectedException() {
		exception.expect(IllegalArgumentException1.class);
		exception.expectMessage("Invalid age");
		new Person("Joe", -1);
	}
	
	/*
	 * Approach 2nd
	 */
//	@Test(expected = IllegalArgumentException.class)
//	public void testExpectedException2() {
//	  new Person("Joe", 5);
//	}
	
	/*
	 * Approach 3rd
	 */
	
//	@Test
//	public void testExpectedException3() {
//	  try {
//	    new Person("Joe", -1);
//	    fail("Should have thrown an IllegalArgumentException because age is invalid!");
//	  } catch (IllegalArgumentException e) {
//	    assertThat(e.getMessage(), containsString("Invalid age"));
//	  }
//	}
//
//	private Matcher containsString(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
