package hw12Abstraction.copy;

public interface University extends College, Hospital{
	/*
	 * Extends is the only keyword used for inheritance in interface.Interface can
	 * inherit only interface class, regular or abstract class cannot be used.It can
	 * inherit more than one interface class using comma.Example: University
	 * inherits College and Hospital Interface
	 * 
	 */
	// public University() {
	// Constructor cannot be created
	// }
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
		System.out.println("This gymnasium feature is from University Interface");
	}

	public static void library() {
		System.out.println("This library feature is from University Interface");
	}
}
