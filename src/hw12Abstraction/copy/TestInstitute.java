package hw12Abstraction.copy;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\nThis class is instantiated for ColumbiaUniversity Class\n");
		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.biology();
		cu.anatomyLab();
		cu.biochemistryLab();
		cu.hygiene();
		cu.caring();
		cu.maths();
		cu.aeronauticalInfo();
		cu.mechanicalLab();
		cu.computerLab();
		cu.anthropology();
		cu.lawInfo();
		cu.classSize();
		cu.playGround();
		cu.teacher();
		cu.gymnasium();
		University.library();// static method called by class name
		cu.commonRoom();
		cu.laboratory();
		cu.languageClub();
		cu.dorm();
		College.studyRoom();// static called by class name
		cu.emergencyRoom();
		cu.surgeryRoom();
		cu.cafeteria();
		cu.morgue();
		Hospital.pharmacy();//// static called by class name
		cu.vocationalInfo();
		System.out.println("\nThis class is instantiated for University Class\n");
		University u = new ColumbiaUniversity();
		u.classSize();
		u.playGround();
		u.teacher();
		u.gymnasium();
		University.library();// static method called by class name
		u.commonRoom();
		u.laboratory();
		u.languageClub();
		u.dorm();
		College.studyRoom();// static called by class name
		u.emergencyRoom();
		u.surgeryRoom();
		u.cafeteria();
		u.morgue();
		Hospital.pharmacy();//// static called by class name
		System.out.println("\nThis class is instantiated for MedicalSchool Class\n");
		MedicalSchool mU = new ColumbiaUniversity();
		mU.anatomyLab();
		mU.biochemistryLab();
		mU.hygiene();
		mU.caring();
		mU.maths();
		mU.aeronauticalInfo();
		mU.mechanicalLab();
		mU.computerLab();
		mU.anthropology();
		mU.lawInfo();

	}

}
