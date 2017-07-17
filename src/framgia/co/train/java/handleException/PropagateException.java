package framgia.co.train.java.handleException;

import java.io.IOException;

public class PropagateException {
	/**
	 * This method is used to divide two integers.
	 * 
	 * @param num1
	 * @param num2
	 * @author javawithease
	 */
	public void division(int num1, int num2) {
		// java.lang.ArithmeticException here
		// and not caught hence propagate to method1.
		System.out.println(num1 / num2);
	}

	public void method1(int num1, int num2) {
		// not caught here and hence propagate to method2.
		division(num1, num2);
	}

	public void method2(int num1, int num2) {
		try {
			method1(num1, num2);
		} catch (Exception e) {// caught exception here.
			System.out.println("Exception Handled");
			System.err.println(e);
		}
	}

	// Throw exception
	public void method3() throws IOException {
		// compile time error here because
		// checked exceptions can't be propagated.
		throw new IOException();
	}

	public void method1() throws IOException {
		method3();
	}

	public void method2() {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String args[]) {
		// creating ArithmaticTest object
		PropagateException obj = new PropagateException();

		// method call
//		obj.method2(20, 0);

		// method call
		obj.method2();
	}
}
