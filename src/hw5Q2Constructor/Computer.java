package hw5Q2Constructor;

public class Computer {

	public String model;
	public String brand;
	public String operating_system;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {// Constructor1 declared
		System.out.println("This is from the default Constructor of Computer class");
	}

	public Computer(String brand, String model) {
		this.model = model;
		this.brand = brand;
		System.out.println("Brand: " + brand + ",\nModel: " + model);
	}

	public Computer(String brand, String model, String operating_system, int price) {
		this.model = model;
		this.brand = brand;
		this.operating_system = operating_system;
		this.price = price;
		System.out.println("Brand: " + brand + ",\nModel: " + model + ",\nOperating system: " + operating_system
				+ ",\nPrice: $" + price);
	}

	public Computer(String brand, String model, String operating_system, int price, char grade, boolean madeInUSA) {// Constructor2
		// initialized
		this.model = model;
		this.brand = brand;
		this.operating_system = operating_system;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Brand: " + brand + ",\nModel: " + model + ",\nOperating system: " + operating_system
				+ ",\nPrice: $" + price + ",\nGrade:" + grade + ",\nMade In USA? Ans:" + madeInUSA + ".");
	}

	public Computer(String brand, String operating_system, int price, char grade, boolean madeInUSA) {// Constructor2
		// initialized
		this.brand = brand;
		this.operating_system = operating_system;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Brand: " + brand + ",\nProcessor: " + ",\nOperating system: " + operating_system
				+ ",\nPrice: $" + price + ",\nGrade:" + grade + ",\nMade In USA? Ans:" + madeInUSA + ".");
	}
}