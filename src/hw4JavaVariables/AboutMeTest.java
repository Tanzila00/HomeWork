package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe myInfo = new AboutMe();// Constructor is initialized
		myInfo.full_name = "Tanzila Zafar";// variable initialized
		myInfo.road_no = 30;// variable intialized
		myInfo.floor_no = 4;
		myInfo.my_salary = 9000;
		myInfo.bank_balance = 100000l;
		myInfo.flat_no = 'F';
		myInfo.queens = true;
		myInfo.road_distance = 2.5f;
		myInfo.my_grade = 99.25000;

		myInfo.aboutMe();//method initialized

		System.out.println("\n---------------------------------------------------");

		AboutMe tanisha = new AboutMe();
		tanisha.full_name = "Alex";// variable initialized
		tanisha.road_no = 20;
		tanisha.floor_no = 3;
		tanisha.my_salary = 10000;
		tanisha.bank_balance = 900000l;
		tanisha.flat_no = 'F';
		tanisha.queens = false;
		tanisha.road_distance = 3.122f;
		tanisha.my_grade = 99.25000;

		tanisha.aboutMe();
	}
}
 