package framgia.co.train.java.interfaceExample;

public class Person implements Active {

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak(String val) {
		System.out.println("Person say "+ val);
	}

	@Override
	public void run() {
		System.out.println("Person run");
	}

	public static void main(String[] args) {

		System.out.println(Active.TEXT_VALUE);
		Person per = new Person();
		per.speak("Hello");
		per.run();
		
		Active ac = new Person();
		ac.speak("Hi");
		ac.run();

	}
	
	
}
