package framgia.co.train.java.handleException;

import java.io.IOException;

public class KeywordThrowAndThrows {
	static int sum(int num1, int num2) {
		if (num1 == 0)
			throw new ArithmeticException("First parameter is not valid");
		else
			System.out.println("Both parameters are correct!!");
		return num1 + num2;
	}

	static void mymethod(int num) throws IOException, ClassNotFoundException {
		if (num == 1)
			throw new IOException("Exception Message1");
		else
			throw new ClassNotFoundException("Exception Message2");
	}

	public static void main(String args[]) {
		try {
			int res = sum(0, 12);
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		// try {
		// mymethod(2);
		// } catch (Exception ex) {
		// System.out.println(ex);
		// }
	}
}
