package main.com.java8;

public class Student {
	private int rollno;
	private String stdName;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Student(String name, int rollno) {
		this.rollno = rollno;
		this.stdName = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stdName=" + stdName + "]";
	}

}
