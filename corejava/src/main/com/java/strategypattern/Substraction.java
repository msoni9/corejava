package main.com.java.strategypattern;

public class Substraction implements Strategy {

	@Override
	public float calculation(float a, float b) {
		return a - b;
	}

}