package framgia.co.train.java.array;

import java.util.Arrays;

public class arrayTest {

	public arrayTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] myArr = {{1,4}, {5,6}, {7,2}, {6,9}};
//		int[][] myArr = new int[][]{{1,4}, {5,6}, {7,2}, {6,9}};
//		
//		for (int i = 0; i < myArr.length; i++) {
//			for (int j = 0; j < myArr[i].length; j++) {
//				System.out.println("index [" + i + "," + j + "]: " + myArr[i][j]);
//			}
//		}
//		
		
		double[] grades = {92.2, 80.5, 69.5, 72.0};
		double[] percentages = Arrays.copyOf(grades, grades.length);
		percentages[3] = 70.0;// doesn’t changes grades[3]
		
		System.out.println(grades[3]);
		
		
		int[] intA1 = {0,2,4,6};
		int[] intA2 = {0,2,4,6};
		int[] intA3 = {10,8,6,4};

		System.out.println(intA1 == intA2);
		System.out.println(Arrays.equals(intA1, intA2));
		System.out.println(Arrays.equals(intA1, intA3));

	}

}
