package hw9Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();// abstract class

	public void biochemistryLab() {// non-abstract class/regular method
		System.out.println("This is an Abstract Class for MedicalSchool");
	}
}
