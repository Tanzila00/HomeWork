package hw11Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("The morgue feature is from Hospital Interface");
	}

	public static void pharmacy() {
		System.out.println("The pharmacy feature is from Hospital Interface");
	}
}
