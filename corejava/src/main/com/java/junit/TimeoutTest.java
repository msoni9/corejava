package main.com.java.junit;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {
	
	@Rule
	public Timeout globaltime = Timeout.seconds(10);
	
	@Test
	public void timeTest() throws InterruptedException{
		TimeUnit.SECONDS.sleep(5);
	}

}
