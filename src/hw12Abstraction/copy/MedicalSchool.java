package hw12Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	/*
	 * Abstract class use keyword extends to inherit regular class or abstract
	 * class. It can only inherit one regular class or one abstract class. For
	 * example: abstract class MedicalSchool can inherit NursingSchool abstract
	 * class. Also abstract class use implements keyword to inherit interface.
	 * hence,abstract class use extends and implements keywords.
	 */
	public MedicalSchool() {// default constructor is created
		System.out.println("This is a default constructor from MedicalSchool class ");
	}

	public abstract void anatomyLab();// abstract class

	public void biochemistryLab() {// non-abstract class/regular method
		System.out.println("This is an Abstract Class for MedicalSchool");
	}

}
