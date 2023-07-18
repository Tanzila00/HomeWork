package hw12Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		Sister s = new Sister();
		s.sister();//void type method
		s.sister(7, 8, 9);//parameterized return type method-01 is initialized
		s.sister(10, 12, 13);//parameterized return type method-02 is initialized
		s.sister("15", 16, 17, 18);//parameterized return type final method-03 is initialized
		Sister.sister(20, 21, 22, 23);// static void type method-04 is called by the class name!!
		System.out.println("\nThis is the outcome for Overriding\n");
		Niece n = new Niece();
		n.sister(7, 8, 9);//parameterized return type method-01 is initialized
		n.sister(10, 12, 13);
		n.sister("15", 16, 17, 18);
		// Niece.sister(20, 21, 22, 23); static void type method can't override.

	}

}
