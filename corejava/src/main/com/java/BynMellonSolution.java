package main.com.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Person {
	String firstName;
	String lastName;
	int age;
	String country;

	public Person(String firstName, String lastName, int age, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return firstName + "|" + lastName + "|" + age + "|" + country;
	}
}

class PersonUtils {
	public static void sortPersons(List<Person> persons, String[] sortBy) {
		// implement the sorting logic
		for (int i = 0; i < sortBy.length; i++) {
			if (sortBy[i].equalsIgnoreCase("firstname")) {
				Comparator<Person> firstnameComp = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
				Collections.sort(persons, firstnameComp);
			}
			if (sortBy[i].equals("lastname")) {
				Comparator<Person> lastnameComp = (e1, e2) -> e1.getLastName().compareTo(e2.getLastName());
				Collections.sort(persons, lastnameComp);
			}
			if (sortBy[i].equals("country")) {
				Comparator<Person> countryComp = (e1, e2) -> e1.getCountry().compareTo(e2.getCountry());
				Collections.sort(persons, countryComp);
			}
			if (sortBy[i].equals("age")) {

				Comparator<Person> ageComp = (e1, e2) -> {
					int age1 = e1.getAge();
					int age2 = e2.getAge();
					if (age1 == age2) {
						return 0;
					} else if (age1 > age2) {
						return 1;
					} else {
						return -1;
					}
				};
				Collections.sort(persons, ageComp);
			}
		}

	}
}

public class BynMellonSolution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String[] res;
		int count = 0;
		// read the first line the number indicates number of person records
		// below
		// person records start from 3rd line
		try {
			count = Integer.parseInt(in.nextLine());
		} catch (Exception e) {
			count = 0;
		}

		// read the 2nd line; the sort options are given in this line
		String sortLine = in.nextLine();
		String[] sortBy = sortLine.split(";");

		List<Person> personList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			String inputLine = in.nextLine();
			// the person details are given in this order:
			// first name; last name; age; country
			String[] parts = inputLine.split("[|]");
			Person person = new Person(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
			personList.add(person);
		}
		System.out.println(personList);
		// PersonUtils.sortPersons(personList, sortBy);
		//
		// for (Person p : personList) {
		// bw.write(p.toString());
		// bw.newLine();
		// }
		// bw.close();

		Comparator<Person> person = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
		Collections.sort(personList, person);

		in.close();
	}
}