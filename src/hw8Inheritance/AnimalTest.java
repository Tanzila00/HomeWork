package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {//Hierarchical Inheritance
		System.out.println("\n-----------01-----------\n");
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n-----------02-----------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n-----------03-----------\n");
		Reptile reptile = new Reptile();//single class inheritance
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n--------------04--------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n-----------05-----------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n-----------06-----------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n----------07------------\n");
		BullDog bullDog = new BullDog();//multilevel Inheritance
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n-----------08-----------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n-----------09-----------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

	}
}
