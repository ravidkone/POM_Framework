package overriding;

public class Dog extends Animal {
	
	public void animalSound() {
		//super.animalSound(); // refers to the object of immediate parent class
		System.out.println("Dog Says Bow bow");
	}
	
}
