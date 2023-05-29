package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {

		Computer myComputer01 = new Computer();
		System.out.println("\n-------");
		Computer myComputer02 = new Computer("Apple", "MacBook Air");
		System.out.println("\n-------");
		Computer myComputer03 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800);
		System.out.println("\n-------");
		Computer myComputer04 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		System.out.println("\n-------");
		Computer myComputer05 = new Computer("Windows", "Intel Corei5", 1000, 'B', true);

	}
}
