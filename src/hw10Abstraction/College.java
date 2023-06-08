package hw10Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("The dorm  feature is from College Interface");
	}

	public static void studyRoom() {
		System.out.println("The studyRoom feature is from College Interface");
	}

}
