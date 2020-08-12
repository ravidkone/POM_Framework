package overriding;

public class Entry {

	public static void main(String[] args) {
		/*
		 Overriding: --
		 Animal --> print something
		Overriding is done in parent child class
		overloading can be done in same class
		*
		*/
		Animal a = new Animal();
		//a.animalSound();
		MakeSound(a);
		Dog d = new Dog();
		//d.animalSound();// both will print, dog says bow bow
		MakeSound(d); //dog reference to --> Animal a
		
		pig p = new pig();
		//p.animalSound();
		MakeSound(p);
		
		Animal a1 = new pig();
		a1.animalSound();
		
		car c = new car();
		//MakeSound(c);//
		
		//There are 2 types of polymorphism
		//1. Static --> Method overloading.compile time
		//2. Dynamic --> Method overriding, run time 
	}

	public static void MakeSound(Animal a) {
		a.animalSound();
	}

}