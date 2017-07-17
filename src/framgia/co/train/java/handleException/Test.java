package framgia.co.train.java.handleException;

import java.io.IOException;

class Test {

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

	public static void main(String args[]){
		//creating Test object
		Test obj =  new Test();
 
		//method call
		obj.method2();
	}
}
