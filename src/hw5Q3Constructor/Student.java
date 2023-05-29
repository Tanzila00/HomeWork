package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public float grade;
	public boolean isProgrammer;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class.");
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student name:" + stName + ", \nStudent ID:" + stID + ", \nStudent sex:" + sex
				+ ", \nIs the student programmer? " + isProgrammer + ", \nStudent grade:" + grade);
	}
}
