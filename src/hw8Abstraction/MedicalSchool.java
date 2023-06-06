package hw8Abstraction;

public abstract class MedicalSchool {
	public MedicalSchool() {// default constructor

	}

	public abstract void anatomyLab();// abstract class

	public void biochemistryLab() {// non-abstract class/regular method
		System.out.println("This is an Abstract Class for MedicalSchool");
	}

}
