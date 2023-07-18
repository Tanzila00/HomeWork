package hw12Polymorphism;
/*Overriding also known as- Dynamic Polymorphism,late binding,Run time
 * Final and static method can't be override.
 * Method name and class name can be same but in LowerCase.
 * Here,same method of variable,same number of variable but the logic/Syntax needs to be different.
 */

public class Niece extends Sister {

	@Override
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 / 2 + age3;
		System.out.println("The total age from return parameterized type:" + total1);
		return total1;
	}

	@Override
	public void sister(String age3, int age4, int age5) {// parameterized return type method-02
		int total2 = Integer.parseInt(age3) + age4 * 2 + age5;
		System.out.println("The total age from void parameterized type:" + total2);
	}
//@Override
	/*
	 * public final int sister(String age6, int age7, int age8, int age9) {//
	 * parameterized return type final method-03 int total3 =
	 * Integer.parseInt(age6)+ age7 + age8 + age9;
	 * System.out.println("The total age from void parameterized type:" + total3);
	 * return total3; }
	 */

//@Override		
	/*
	 * public static void sister(int age10, int age11, int age12, int age13) {//
	 * parameterized void type method-04 int total4 = age10 + age11 + age12 + age13;
	 * System.out.println("The total age from void parameterized type:" + total4); }
	 * 
	 * this is a test for gitbash
	 */

}
