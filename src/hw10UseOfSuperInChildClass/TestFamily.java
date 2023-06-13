package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n----------Here default constructor initialized ---------");
		Daughter dtr = new Daughter();

		System.out.println("\n---------- Here parameterized void method initialized------------");
		dtr.daughterInfo("Februaury", 38);
	}

}
