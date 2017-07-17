package framgia.co.train.java.collection;

import java.util.ArrayList;

public class CompareArrayAndCollection {

	public CompareArrayAndCollection() {
		// TODO Auto-generated constructor stub
		compareArray();
		compareCollection();
	}
	 public static void main(String[] args) {
		 CompareArrayAndCollection textEx1 = new CompareArrayAndCollection();
	 }
	 
	 // compare Array and collection	 
	 public void compareArray () {
		String[] arrs = new String[3];
		arrs[0] = "java";
		arrs[1] = "Spring";
		arrs[2] = "Hibernate";
		
		for (String item : arrs) {
			System.out.println( item);
		}
	}
	 
	 public void compareCollection() {
		 ArrayList<String> arrs = new ArrayList<>();
		 arrs.add("java");
		 arrs.add("Spring");
		 arrs.add("Hibernate");
		 
		 for (String item : arrs) {
			System.out.println(item);
		}
	}
	 // END - compare Array and collection
	 

}
