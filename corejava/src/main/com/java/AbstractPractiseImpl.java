package main.com.java;

public class AbstractPractiseImpl extends AbstractTest {

	@Override
	public void demo() {
		super.demo();
		System.out.println("I'm child demo");
	}

	public void show() {
		System.out.println(this.hashCode());
		this.demo();
	}

	public static void main(String args[]) {
		AbstractPractiseImpl abbb = new AbstractPractiseImpl();
		abbb.show();
		abbb.parentShow();

	}
}
