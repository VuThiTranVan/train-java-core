package framgia.co.train.java.generics;

import java.util.ArrayList;
import java.util.List;

public class RunText {

	public static void main(String[] args) {
		GenericsType<String> type = new GenericsType<>();
		type.set("Pankaj"); // valid

		GenericsType type1 = new GenericsType(); // raw type
		type1.set("Pankaj"); // valid
		type1.set(10); // valid and autoboxing support
		System.out.println(type1.get());
		
		System.out.println(isEqual(type1, type));
		
		List list = new ArrayList<String>();
		list.add("Test");
		list.add(1);
		for (Object object : list) {
			System.out.println(object);
		}
		
		
	}
	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
		return g1.get().equals(g2.get());
	}

}
