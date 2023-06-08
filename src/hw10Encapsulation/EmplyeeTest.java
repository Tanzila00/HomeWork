package hw10Encapsulation;

public class EmplyeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Tanzila Zafar");
		emp.setAge(29);
		emp.setSex('F');
		emp.setCitizen(true);
		System.out.println("Employee name:" + emp.getName() + "\nEmployee Age:" + emp.getAge() + "\nEmployee Sex:"
				+ emp.getSex() + "\nEmployee Citizen:" + emp.isCitizen());

	}
}
