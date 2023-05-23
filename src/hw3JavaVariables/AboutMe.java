package hw3JavaVariables;

import hw1JavaBasic.MySelf;

public class AboutMe {
	
	public String myName;//variable declared
	public String full_name="Tasmee Hoque";//variable initialized
	public byte road_no=30;
	public int floor_no=4;
	public short my_salary=9000;
	public long bank_balance=100000l;
	public char flat_no='F';
	public boolean queens=true;
	public float road_distance=2.5f;
	public double my_grade=99.25000;
	
	public static void main(String[] args) {
		AboutMe mySelf= new AboutMe();
		System.out.println("My name is "+mySelf.full_name+". My salary is "+ mySelf.my_salary+".");
		
	}
	
	

}
