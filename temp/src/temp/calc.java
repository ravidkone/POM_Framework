package temp;

public class calc {

	/*
	 * public void addInt(int a,int b) {
	 * 
	 * } public void addDouble(double a, double b) {
	 * 
	 * }
	 */
	//Method overloading --> allows a class to have more than one method having 
	///same name and there argument lists are different
	// It will not check what it is returning
	public int add(int a, int b) {
		return a+b;
	}

	public double add(double a, double b) {
		return a+b;
	}
	//Three ways overloading methods
	//1. Number of parameters
	public int add(int a, int b,int c) {
		return a+b;
	}
	public double add(double a, double b, double c) {
		return a+b;
	}
	
	//2.Data types of parameter
	public float add(int a, float b) {
		return a+b;
	}	
	
	
	//3. sequence of data type parameter
	public float add(float a, int b, int c) {//
		return a+b;
	}	

	// Are you guys are free in this weekend? --> Extra class
	
	//Method overriding
	//Polymorhism
	//super keyword
	//Access modifier
	
}
