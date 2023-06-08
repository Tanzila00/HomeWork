package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	/*
	 * Regular class use extends keyword to inherit one regular class or one
	 * abstract class. It can inherit more than one regular/abstract class For
	 * example: regular class ColumbiaUniversity can inherit MedicalSchool abstract
	 * class.
	 */

	// public abstract void chemistry();
	// abstract class cannot be created in regular class
	public ColumbiaUniversity() {// default constructor

	}

	public void biology() {
		System.out.println("This is a regular method for ColumbiaUniversity ");

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
