package hw10UseOfSuperInChildClass;

public class Father {
	// variables declared
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;// variable initialized in child class.

	public Father() {// default constructor
		System.out.println("This is a constructor method from Father class ");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {// parameterized default constructor
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("\nFrom Parent Class:-" + " Name: " + name + ", Age: " + age + ", Sex: " + sex
				+ ", US Citizen: " + usCitizen);
	}

	public void father() {// void type method
		System.out.println("This is a void type method from Father Class");

	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {// parameterized void method
		System.out.println("\nFrom Parent Class:-" + " Name: " + name + ", Age: " + age + ", Sex: " + sex
				+ ", US Citizen: " + usCitizen);
	}

}
