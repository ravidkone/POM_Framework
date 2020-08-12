package ErrorsExceptions;

public class entry {
/*
 1.Access modifier
 2.Boxing and unboxing
 3. Errors and Exception
 
 */
	public static void main(String[] args) {
		//Exception 
		/*int[] iArr= {2,4,5}; //--
		try{
			System.out.println(iArr[1]);
			System.out.println("END OF TRY");
		}catch (Exception e){//there should be 1 catch exception is mandatory
			//Block of code to handle errors
			System.out.println("I FOUND EXCEPTION");
			// you can do some actions in this block
		}

		System.out.println("END");*/
		
		String str="srinidhi";
		//String str=null;
		int[] iArr= {2,4,5};
		try {
			
			System.out.println(str.charAt(4));
			System.out.println(iArr[5]);
		}catch(StringIndexOutOfBoundsException a)
		{
			//System.out.println("What Exception Priniting : "+a);
			System.out.println(str.length());
			
		}catch(NullPointerException a) {
			//System.out.println();
			str="default";
			System.out.println("Inside null pointer exception");
		}
		catch(Exception a) {
			System.out.println(a);
		}
		finally { //finally will execute irrespective of whether it throw exception or not
			System.out.println("Im final");
		}
	System.out.println("END");
	
// checked exception
// un checked exception
	/*
UnChecked Exception
	 Sr.No.	Exception & Description
1. ArithmeticException : Arithmetic error, such as divide-by-zero.
2. ArrayIndexOutOfBoundsException : Array index is out-of-bounds.
3. ArrayStoreException : Assignment to an array element of an incompatible type.
4. ClassCastException : Invalid cast.
5. IllegalArgumentException : Illegal argument used to invoke a method.
6. IllegalMonitorStateException : Illegal monitor operation, such as waiting on an unlocked thread.
7. IllegalStateException : Environment or application is in incorrect state.
8. IllegalThreadStateException : Requested operation not compatible with the current thread state.
9. IndexOutOfBoundsException : Some type of index is out-of-bounds.
10. NegativeArraySizeException : Array created with a negative size.
11. NullPointerException : Invalid use of a null reference.
12. NumberFormatException : Invalid conversion of a string to a numeric format.
13. SecurityException : Attempt to violate security.
14. StringIndexOutOfBounds : Attempt to index outside the bounds of a string.
15. UnsupportedOperationException : An unsupported operation was encountered.

Checked Exceptions 

Sr.No.	Exception & Description
1. ClassNotFoundException : Class not found.
2. CloneNotSupportedException : Attempt to clone an object that does not implement the Cloneable interface.
3. IllegalAccessException : Access to a class is denied.
4. InstantiationException : Attempt to create an object of an abstract class or interface.
5. InterruptedException : One thread has been interrupted by another thread.
6. NoSuchFieldException : A requested field does not exist.
7. NoSuchMethodException : A requested method does not exist.

	 * */
	//nested try catch
	try {
		//Try this block 1
		//If any exception --> Catch block 1
	}catch(Exception a) {//catch block 1
		try {
			//It will try 2 here if it is failed in the previous
			// If you are getting any exception 
		}catch(Exception  b) {//catch block 2
			//coming to this catch
		}
	}
}
}
