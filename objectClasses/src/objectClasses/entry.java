package objectClasses;

public class entry {
	// Please join class sharp 10PST
	// please wait for the oppurtunity to ask questions
	// please wait for the completion of someone answer
	public static void main(String[] args) {
		//construction of your house --> blue print of print
		//blue print has all the details you can think of but it is not an object
		car c1 = new car();
		car c2 = new car();
		
		c1.color="Gray";
		c2.color="white";
	//Audi Q7 --> owner, color, number, but desighn will be the same
		c1.maxSpeed=120;
		c2.maxSpeed=90;
		c1.sModelName="Audi Q7";
		c2.sModelName="Audi Q5";
		c1.fuelType="diesel";
		System.out.println("colour1: "+c1.color+"\tMaxSpeed1: "+c1.maxSpeed+"\t ModelName1 : "
		+c1.sModelName+"::"+c1.fuelType);
		System.out.println("colour2: "+c2.color+"\tMaxSpeed2: "+c2.maxSpeed+"\t ModelName2 : "
		+c2.sModelName+"::"+c2.fuelType);
		c2.maxSpeed = 150;
		//car.fuelType="petrol";
		c2.fuelType="petrol";
		
		System.out.println("****************************");
		System.out.println("colour1: "+c1.color+"\tMaxSpeed1: "+c1.maxSpeed+"\t ModelName1 : "
				+c1.sModelName+"::"+c1.fuelType);
				System.out.println("colour2: "+c2.color+"\tMaxSpeed2: "+c2.maxSpeed+"\t ModelName2 : "
				+c2.sModelName+"::"+c2.fuelType);
			
				c1.specialFeature();
				car.specialFeature();
				
				
		//Static and non-static 
		//it wont change, never change
		//Static means --> Single memory for all the instances
				
		// Static variables can be accessed without object/ using class name		
	//Static methods can only call static methods, it cannot call non-static methods
	//in non-static method you can call static and nonstatic
	//static methods can access static variable only but not non-static variables			
	}

	//Static methods
}
