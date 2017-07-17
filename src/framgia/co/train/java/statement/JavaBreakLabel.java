package framgia.co.train.java.statement;

public class JavaBreakLabel {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
		boolean found = false;
		int row = 0;
		int col = 0;
		// find index of first int greater than 10
		searchint:

		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[row].length; col++) {

				System.out.println("*");
				if (arr[row][col] > 10) {
					found = true;
					// using break label to terminate outer statements
					break searchint;
				}
			}
		}
		if (found)
			System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
		boolean found1 = false;
		int row1 = 0;
		int col1 = 0;
		for (row1 = 0; row1 < arr.length; row1++) {
			for (col1 = 0; col1 < arr[row1].length; col1++) {

				System.out.println("*");
				if (arr[row1][col1] > 10) {
					found1 = true;
					break;
				}
			}
		}
		if (found1)
			System.out.println("First int greater than 10 is found at index: [" + row1 + "," + col1 + "]");
	}

}
