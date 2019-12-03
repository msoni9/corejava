package main.com.java.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Test123 {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	 
	@Test
	public void whenExceptionThrown_thenRuleIsApplied() {
	    exceptionRule.expect(NumberFormatException.class);
	    exceptionRule.expectMessage("For input string");
	    Integer.parseInt("1a");
	}
	
	@Test(expected = NullPointerException.class)
	public void whenExceptionThrown_thenExpectationSatisfied() {
	    String test = null;
	    test.length();
	}
	
	

}
