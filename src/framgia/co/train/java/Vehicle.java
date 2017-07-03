package framgia.co.train.java;

public class Vehicle {
	private String name;
	private String color;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void run(String valueName) {
		System.out.println(valueName);
	}
	
	public void display() {
		System.out.println("name: " + getName());
		System.out.println("color: " + getColor());
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("car", "yellow");
		car.display();

	}

}
