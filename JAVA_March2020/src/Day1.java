import java.util.Iterator;

public class Day1 {

	//Very first line of code whihc java start to execute i sfrom main onwards
	//Sequential basis
	public static void main(String[] args) {
		
		//ctrl+/ to comment and uncomment--> ctrl+shift+/ comment, ctrl+shift+\ un comment 
		/*System.out.println("Srinidhi");
		System.out.println("+1-4086204988");
		System.out.println("srinidhi.b@tekarch.com");
		System.out.println("Deekshith");
		System.out.println("deekshith.g@tekarch.com");
		System.out.println("+91-9738279668");
		*/
		//Data types
		//what is data? information/value information whihc needs to be stored
		/*int a=10;
		double b = 10.23;
		char c = 'A';
		boolean d = true;
		float e = 5f;
		String s = "Nidhi";
		
		System.out.println("a = "+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(s);
		System.out.println(b+a+e);
		System.out.println(b+s);*/
		//+ can be used for concatinating and also for addition 
		
		//If else condetion 
		// Define a condetion, If condetion is satisfied then set of statements going to execute it
		//if some one scoring in exam , if the score below 35 he is failed, 35+ is passed
		//Coding standards --> while writing a code
		//int iScore=90;
		/*int score=10;
		int i=10;*/
		//Debugging mode // F6 to go line by line, F8 to continue without using debugger or wait in the next debugger point
		/*if(iScore>35) {
			System.out.println("Student is Passed");
			if(iScore>70)
			{
				System.out.println("Distinction student");
			}
		}else {			
			System.out.println("Student is failed");
			
		}*/
		
		int iScore=34;
		//if elseif else
		//35-50 --> pass, 51-60--> average, 61-75 --> Good, 76-100 --> Best, below 35 --> failed
		// 50 is lesser than 50 --> equal to 50
		/*if(iScore>=35 && iScore<=50) {
			System.out.println("Student is passed");
		}
		else if(iScore>=51 && iScore<=60) {
			System.out.println("Student is Average");
		}
		else if(iScore>=61 && iScore<=75) {
			System.out.println("Student is Good");
		}
		else if(iScore>=76 && iScore<=100) {
			System.out.println("Student is Best");
		}
		else {
			System.out.println("Student is Failed");
		}*/
		
		//Switch  --> 
		//1 =addition, 2=subtraction, 3=Multipl, 4= Division
		int iValue1=10;double iValue2=20.1;
		int iCondetionType=3;
		//what is break;
		switch (iCondetionType) {
		case 1:
			System.out.println(iValue2+iValue1);
			break;
		case 2:
			System.out.println(iValue2-iValue1);
			break;
		case 3:
			System.out.println(iValue2*iValue1);
			break;
		case 4:
			System.out.println(iValue2/iValue1);
			break;
		default:
			System.out.println("Give Valid condetion to perform");
			break;
		}
		System.out.println("****************************");
		String sCondetionType="div";
		switch (sCondetionType) {
		case "add":
			System.out.println(iValue2+iValue1);
			break;
		case "sub":
			System.out.println(iValue2-iValue1);
			break;
		case "mul":
			System.out.println(iValue2*iValue1);
			break;
		case "div":
			System.out.println(iValue2/iValue1);
			break;
		default:
			System.out.println("Give Valid condetion to perform");
			break;
		}
	// Problem statement --> understand what is the problem, come with your solution, 
	// Then apply your coding techniques, Write your program
				
		
		//Please join 10:00AM PST without fail --> 2 minutes early
		
		
	}

}
