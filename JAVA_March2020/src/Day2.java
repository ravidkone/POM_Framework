
public class Day2 {

	static int scopeGlobal = 1000;
	// Data Type, conditional statemetn(if,ifelse, nested if,switch, Debugging,
	// comments

	// For loop, While, do-while, Break and continue, for each loop,scope ofVariable
	// Methods and paramaeters, Return types
	public static void main(String[] args) {
		System.out.println(scopeGlobal);
		// System.out.println(scope3);
		
		  System.out.println("Srinidhi"); System.out.println("Srinidhi");
		  System.out.println("Srinidhi"); System.out.println("Srinidhi");
		  System.out.println("Srinidhi"); System.out.println("Srinidhi");
		  System.out.println("Srinidhi");
		 
		/*
		 * for(int i=1; i<7; i++) { System.out.println("Srinidhi = "+i);
		 * 
		 * }
		 */
		  
		  

		/*
		 * for(int i=20; i>1; i=i-2) { System.out.println("Srinidhi = "+i); }
		 */
		  
		  
		// from 10 onwards you are keep on increasing, 10 > 2
		  
		/*
		 * for(int i=10; i>2;i++) { System.out.println("Srinidhi = "+i); }
		 */

		  
		// Arrays
		/*
		 * for(datatype variableName : arrayName){ //code to be executed }
		 */

		String car = "Audi";
		String[] cars = { "Mercedes", "BMW", "Ford", "Volksvegan", "Toyota" };

		for (String str : cars) {
			System.out.println(str);
		}

		/*
		 * for(int i=0;i<cars.length;i++) { System.out.println(cars[i]); }
		 * 
		 * 
		 * // 2. while loop /* while(condition) { // statement(s); }
		 */
		/*
		 * int i=10; while(i>=0) { System.out.println(i); i--; // -- increment/decrement
		 * the value to 1 }
		 */
		// 3. Do-While
		/*
		 * do { statement(s); } while(condition);
		 */
		/*
		 * int j=11; do { System.out.println(j); j++; // infinite loop, print only once
		 * }while(j<10); //11<10
		 */
		//
		// 3. Break and continue statement

		/*
		 * for(int i=1; i<=10;i++) {
		 * 
		 * if(i==5) { break;} System.out.println(i); }
		 * System.out.println("outside of the loop");
		 */

		/*
		 * for(int i=1; i<=10;i++) {
		 * 
		 * if(i==5 || i==6) {//skip 5th one continue;} System.out.println(i); }
		 * System.out.println("outside of the loop");
		 * 
		 */
		// break for 10 minutes. Tell me how many times line 85 going to print
		// Will be back 11:15 PST
		// 9 times, 45 times,
		//// Scope of the variable
		// school(name)--> classes 1-10 --> class 2 - children for every classes
		int count = 0;
		int scope3 = 100;

		for (int i = 0; i <= 10; i++) {// for loop 1
			System.out.println("Srinidhi");
			int scope2 = 20;
			System.out.println(scope2);
			System.out.println(scopeGlobal);
			for (int j = 0; j <= 5; j++) {// for loop 2
				int scope1 = 10;
				System.out.println(scope1);
				System.out.println(scope2);
				// int scope1=10;
				System.out.println("count of i " + i + " and j = " + j);
				count++;
			}
			System.out.println(scope2);
			// System.out.println(scope1);
		}
		// System.out.println(scope2);
		System.out.println("outside of the loop" + count);
	}

}


  jefwjebfew nefqenf ef qenf q
 
