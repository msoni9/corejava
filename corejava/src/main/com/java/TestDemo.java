package main.com.java;

interface interf {

	public void methodOne();

	public class TestDemo {
		public static void main(String[] args) {
			interf i = () -> System.out.println("Execution");
			i.methodOne();

		}
	}
}
