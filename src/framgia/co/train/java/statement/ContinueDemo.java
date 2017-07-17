package framgia.co.train.java.statement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContinueDemo {

	public static void main(String[] args) {
		// int num;
		// Scanner sc = new Scanner(System.in);
		// try {
		// System.out.printf("Enter number: ");
		// num = sc.nextInt();
		// System.out.println("Number is: " + num);
		// } catch (InputMismatchException e) {
		// System.out.println("Error! Invalid number.");
		// }

		// String s1="java";
		// String s2="java";
		// String s3=new String("java");
		// String s4="JAVA";
		// System.out.println(s1==s2);//true
		// System.out.println(s1==s3);//false
		// System.out.println(s1==s4);//false
		// System.out.println(s1.equals(s2));//true
		// System.out.println(s1.equals(s3));//true
		// System.out.println(s1.equals(s4));//false
		// System.out.println(s1.equalsIgnoreCase(s2));//true
		// System.out.println(s1.equalsIgnoreCase(s3));//true
		// System.out.println(s1.equalsIgnoreCase(s4));//true
		// String s1 = "Hello";
		// String s2 = "Hello";
		// String s3 = "Hi";
		// System.out.println(s1.compareTo(s2));// 0
		// System.out.println(s3.compareTo(s1));// 1
		//
		// System.out.println(s1.startsWith("ja"));
		// String s1="Sain";
		// String s2="Sachin";
		// String s3="Ratan";
		// System.out.println(s1.compareTo(s2));//0
		// System.out.println(s1.compareTo(s3));//1(because s1>s3)
		// System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )

		StringBuilder tmp = new StringBuilder(); // Using default 16 character
				// size
		String 	variable1 = "hi";	
		String variable2 = "Hello";
		tmp.append("prefix ");
		tmp.append(variable1);
		tmp.append(" middle ");
		tmp.append(variable2);
		tmp.append(" end");
		System.out.println(tmp.toString());
	}

}
