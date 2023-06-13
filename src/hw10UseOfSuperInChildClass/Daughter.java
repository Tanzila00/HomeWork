package hw10UseOfSuperInChildClass;

public class Daughter extends Father {// here daughter is the child class and father is the parent class
	public String birthMonth;// variable declared
	public int age;

	public Daughter() {
		super();// Default Constructor from Parent Class is called using super keyword

		super.father();// Parameterized Constructor from parent class is called using super keyword
		super.fatherInfo("Zafar Ullah", 65, 'M', true);/*
														 * Parameterized void type method from parent class is called
														 * using super keyword
														 */

		super.familyName = "Zafar family";// variable initialized in child class
		System.out.println("Family Name: " + familyName);

		System.out.println("This is the default constructor from Daughter class.");
	}

	public Daughter(String birthMonth, int age) {// parameterized default constructor
		super();

		super.father();
		super.fatherInfo("Jashim Hoque", 60, 'M', true);

		super.familyName = "Hoque Family";
		System.out.println("Family Name: " + familyName);
		System.out.println("Birth Month:" + birthMonth + "Age:" + age);

	}

	public void daughter() {// void type method
		// Constructor can't be called
		// super();
		super.father();// super keyword used to call void type method
		super.fatherInfo("Ayub Uddin", 55, 'M', true);// super keyword used to call parameterized void type method

		super.familyName = "Uddin family";
		System.out.println("Family Name:" + familyName);

		System.out.println("This is the void type method");
	}

	public void daughterInfo(String birthMonth, int age) {// parameterized void type method
		// Constructor can't be called
		// super();

		super.father();
		super.fatherInfo("Nur Nabi", 50, 'M', true);

		super.familyName = "Nabi Family";
		System.out.println("Family Name:" + familyName);

		System.out.println("Birth Month:" + birthMonth + "  Age:" + age);

	}

}
