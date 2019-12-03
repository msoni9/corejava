package main.com.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class SquareRoot {

	public static void main(String args[]) {
		IntFunction<Integer> p = i -> i * i;
		System.out.println(p.apply(4));

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("durga"));

		ToIntFunction<String> intf = s -> s.length();
		System.out.println(intf.applyAsInt("Mayank"));

		IntToDoubleFunction fs = i -> Math.sqrt(i);
		System.out.println(fs.applyAsDouble(9));

		BiFunction<Integer, Integer, Integer> bifnc = (a, b) -> a * b;
		System.out.println(bifnc.apply(10, 20));

		BiPredicate<Integer, Integer> bipre = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bipre.test(10, 20));
	}

}
