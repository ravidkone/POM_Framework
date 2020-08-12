
public class Day2_1 {

	// Methods and parameters
	public static void main(String[] args) {

		/*
		 * int a = add(10,15); System.out.println(a); int b = sub(20,5);
		 * System.out.println(b); int c = add(30, 45); System.out.println(c);
		 * printMyname();
		 */
		// printNumberfromTo(0,10);
		/*
		 * printNumberfromTo(10,20); int sumValue=add(15,25); int output=sub(sumValue,
		 * 10);
		 */
		int afSub = sub(20, 10);
		System.out.println(afSub * 10);		
	}

	private static void printNumberfromTo(int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(i);
		}

	}

	static int add(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println(num3);
		return num3;
	}
/// we use eclipse --> 
	static int sub(int sub1, int sub2) {
		if (sub1 > sub2) {
			int sub3 = sub1 - sub2;
			return sub3;
		} else {
			int sub3  = sub2 - sub1;
			//return sub3;
		}
	System.out.println("srinidhi");
	return sub1;
	}

	static void printMyname() {
		System.out.println("Srinidhi");
	}

	// return
	void method() {
		// statemetns
	}
	//Java(40),Selenium,Git,Maven,Cucumber, Manual,Agile
	//10AM PST --> we are really going slow --> 
	// 2.5-3 hours for training 1-1.5 hour to complete you assignment , 1-1.5 hour for your workshop
	//we have only 50 days of time do this --> 150 day
//	deekshith.g@tekarch.com
	
	/*
	 500+ people
1. User Inputs ( Scanners) 
2. Java Strings
3. Difference b/w .equals and ==
4. Why is String immutable
5. Static vs Non Static variables and Methods
6. Why is Main method Static
7. Concept of Pass by Value vs Pass by Ref
8. Boxing and UnBoxing"
	 * */

	
}
