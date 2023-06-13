package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	/*
	 * Abstract class use keyword extends to inherit regular class or abstract
	 * class. It can only inherit one regular class or one abstract class. For
	 * example: abstract class MedicalSchool can inherit NursingSchool abstract
	 * class.
	 */
	public MedicalSchool() {// default constructor is created
System.out.println("This is a default constructor from MedicalSchool class ");
	}

	public abstract void anatomyLab();// abstract class

	public void biochemistryLab() {// non-abstract class/regular method
		System.out.println("This is an Abstract Class for MedicalSchool");
	}

}
