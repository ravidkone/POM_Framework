
public class DAy3_Recursive {

	static int count = 0; 
	public static void main(String[] args) {
		//REcursive --> calling methods in the method itself recursively
		
		//First learn recursive then will add it into For loop
		
			//func();
		//Recursive is only for interview purpose, Realtime we will not be using much
		System.out.println(factorial(5));
			}
	static void func() {
		count++; //--> 0-->1, 1-->2 ....5-->6
		if(count<=5) { //1<=5, 2<=5, 5<=6 c
			System.out.println("Hello :: "+count); // it is printed
			func(); // Again called the same function,
		}
		//factorial of a number --> n*(n-1)*(n-2)...*1 
	}
//5
	static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return(n*factorial(n-1));
		
	}
	

}
