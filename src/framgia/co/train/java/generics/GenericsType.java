package framgia.co.train.java.generics;

public class GenericsType<T> {

	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	public static void main(String args[]) {
		GenericsType<String> type = new GenericsType<>();
		type.set("Pankaj"); // valid

		GenericsType type1 = new GenericsType(); // raw type
		type1.set("Pankaj"); // valid
		type1.set(10); // valid and autoboxing support
		
		
		
	}

}


// Old
//public class GenericsTypeOld {
//
//	private Object t;
//
//	public Object get() {
//		return t;
//	}
//
//	public void set(Object t) {
//		this.t = t;
//	}
//
//        public static void main(String args[]){
//		GenericsTypeOld type = new GenericsTypeOld();
//		type.set("Pankaj"); 
//		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
//	}
//}