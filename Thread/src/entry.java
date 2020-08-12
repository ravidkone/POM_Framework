
public class entry {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	thread_demo thread1 = new thread_demo("Thread One");
	thread_demo thread2 = new thread_demo("Thread Two");
	
	thread1.start();//--> Start the thread and come out
	thread2.start();
	//What is muti threading?
	// What is thread?
	//How do you implement it?
	//What is deadlock?
	//DEADLOCK  -> Lock
	//Condetion where 2 or more threads are blocked forever, Waitign for each other
	//You have to implement thread properly --> Developer
	
	//String --> Immutable , Thread Safe, slow
	String s1 = "ABC";
	String s2 = new String("ABC");
	
	//StringBuffer --> Mutable , Thread Safe, slow but faster than string
	StringBuffer sb1 = new StringBuffer("ABC");
	
	//StringBuilder --> Mutable , Not Thread safe , Fast
	StringBuilder sb2 = new StringBuilder("ABC");
	
	}

}
