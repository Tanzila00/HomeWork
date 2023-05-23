package hw4JavaVariables;

public class AboutMe {
	public String myName;// String declared
	public String full_name;// variable declared
	public byte road_no;
	public int floor_no;
	public short my_salary;
	public long bank_balance;
	public char flat_no;
	public boolean queens;
	public float road_distance;
	public double my_grade;

	public AboutMe() { // Constructor declared
		System.out.println("This is all about us:");

	}

	public void aboutMe() {// Method is implemented and initialized
		System.out.println("My name is " + full_name + ". " + "\nI live in road no:" + road_no + ",floor no:" + floor_no
				+ ".\nI earn annually " + my_salary + ".\nCurrently I have " + bank_balance
				+ "dollar.\nMy county is queens: " + queens + ".\nMy flat no is:" + flat_no + "\nMy road distance is:"
				+ road_distance + ".\nFinally my schaool grade is " + my_grade + ".");

	}

}
