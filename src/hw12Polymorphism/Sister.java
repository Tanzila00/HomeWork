package hw12Polymorphism;
/*
 * Overloading is also known as - Static Polymorphism,Early Binding, Compile time 
 * Final and static type method can be overloaded
 * method name can be same as class name but in LowerCase
 * even if the name is same they should have different parameters.
 * same type of variable,same number of variable, same position is not allowed
 * whereas:same type of variable, same number of variable but different position is allowed
 */

public class Sister {// parameterized return type method-01

	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("The total age from return parameterized type:" + total1);
		return total1;
	}

	public void sister(String age3, int age4, int age5) {// parameterized return type method-02
		int total2 = Integer.parseInt(age3) + age4 + age5;
		System.out.println("The total age from void parameterized type:" + total2);
	}

	public final int sister(String age6, int age7, int age8, int age9) {// parameterized return type final method-03
		int total3 = Integer.parseInt(age6) + age7 + age8 + age9;
		System.out.println("The total age from void parameterized type:" + total3);
		return total3;
	}

	public static void sister(int age10, int age11, int age12, int age13) {// parameterized void type method-04
		int total4 = age10 + age11 + age12 + age13;
		System.out.println("The total age from void parameterized type:" + total4);
	}
}