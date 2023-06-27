package hw12Abstraction.copy;

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
		System.out.println("This is a regular method named biology for ColumbiaUniversity ");

	}

	@Override
	public void anatomyLab() {
		System.out.println("This is a regular void type method named anantomyLab for ColumbiaUniversity ");

	}

	@Override
	public void hygiene() {
		System.out.println("This is the hygiene method called inside ColumbiaUniversity");

	}

	@Override
	public void commonRoom() {
		System.out.println("This is the commonRoom method called inside ColumbiaUniversity");

	}

	@Override
	public void laboratory() {
		System.out.println("This is the laboratory method called inside ColumbiaUniversity");

	}

	@Override
	public void languageClub() {
		System.out.println("This is the languageClub method called inside ColumbiaUniversity");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is the emergencyRoom method called inside ColumbiaUniversity");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is the surgeryRoom method called inside ColumbiaUniversity");

	}

	@Override
	public void cafeteria() {
		System.out.println("This is the cafeteria method called inside ColumbiaUniversity");

	}

	@Override
	public void lawInfo() {
		System.out.println("This is the lawInfo method called inside ColumbiaUniversity");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("This is the vocationalInfo method called inside ColumbiaUniversity");

	}

	@Override
	public void classSize() {
		System.out.println("This is the classSize method called inside ColumbiaUniversity");

	}

	@Override
	public void playGround() {
		System.out.println("This is the playGround method called inside ColumbiaUniversity");

	}

	@Override
	public void teacher() {
		System.out.println("This is the teacher method called inside ColumbiaUniversity");

	}

}
