package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	/*
	 * Regular class use extends keyword to inherit one regular class or one
	 * abstract class. It cannot inherit more than one regular/abstract class For
	 * example: regular class ColumbiaUniversity can inherit MedicalSchool abstract
	 * class. Regular class can use implements keyword to inherit interface.(We have
	 * to add unimplemented method) It can use implements to inherit more than one
	 * interface
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

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

}
