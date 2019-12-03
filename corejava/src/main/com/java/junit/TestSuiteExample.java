package main.com.java.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AssertionsTest.class,
	PersonTest.class,
	Exception1Test.class,
	TimeoutTest.class,
	Test123.class,
	NameRuleTest.class})

public class TestSuiteExample {

}

/*
 * we can also create Test Runner class and with the hep of it we can run out suite
 */
