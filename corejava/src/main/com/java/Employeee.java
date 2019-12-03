package main.com.java;

public class Employeee implements Comparable<Employeee> {
	
	private String firstName;
	private int age;
	
	public Employeee(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Employeee e) {
		return this.age - e.age;
	}
	@Override
	public String toString() {
		return "Employeee [firstName=" + firstName + ", age=" + age + "]";
	}
	
	

}
