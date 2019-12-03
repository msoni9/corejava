package main.com.java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class StudentImpl {
	public static void main(String args[]) {
		ArrayList<Student> stdlist = new ArrayList<>();

		BiFunction<String, Integer, Student> bifnc = (name, rollno) -> new Student(name, rollno);

		stdlist.add(bifnc.apply("Prateek", 1));
		stdlist.add(bifnc.apply("Ayush", 2));
		stdlist.add(bifnc.apply("Sujay", 3));

		System.out.println(stdlist);
	}
}
