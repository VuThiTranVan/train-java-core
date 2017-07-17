package framgia.co.train.java.handleException;

public class TryCatchExample {

	public static void divisionNumber() {
		int n1 = 10;
		int n2 = 0;
		System.out.println("n1/n2 = " + n1 / n2);
	}

	public static void divisionNumber1() {
		int n1 = 10;
		int n2 = 0;
		try {
			System.out.println("n1/n2 = " + n1 / n2);
		} catch (Exception e) {
			System.out.println("Exception caught " + e.getMessage());
		}

	}

	public static void divisionNumber2() {
		try {
			int a[] = new int[7];
			a[4] = 30 / 0;
			System.out.println("First print statement in try block");
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}
	}

	public static void main(String[] args) {
		// divisionNumber();
		// divisionNumber1();
		divisionNumber2();

	}

}
