
public class Day4 {

	//Recursive loop
	// Arrays
	//Strings
	public static void main(String[] args) {
		
		//String str = "Hello"; 
		// String is not primitive data
		//String is a separate class
		/*System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf("H"));
		System.out.println(str.replace("e", "M"));
		*/
		/*String str1 = "sri";
		String str2 = "Nidhi";
		System.out.println(str1+str2);
		String sText = "asdda\tsda"+"qwelkjbr";
		System.out.println(sText);*/
		//Take that assighnment --> will talk tomorrow --> Start exploring it
		/*
		String str1="sri"; // sri --> str1 --> 114154
		String str2="nidhi"; // nidhi --> str2 --> 104814794
		System.out.println("str1.hashCode() : "+str1.hashCode());
		System.out.println("Before:");
		System.out.println("str2.hashCode() : "+str2.hashCode());
		
		str2=str1; //--> str2 = nidhi --> orpha
		System.out.println("After:");
		System.out.println("str2.hashCode() : "+str2.hashCode());
		str2="nidhi";
		System.out.println("str2.hashCode() : "+str2.hashCode());
		str1=str1+"xxx";
		System.out.println("str2.hashCode() : "+str2.hashCode());
		int i=10; //10 --> will not be left orphanse
		int j=20;
		i=j;*/
		//There cannot be more than 1 string with the same value in memory
		//String cannot change value, instead a new string is formed always
		
		//HEAP MEMORY
		// run time data memory
		//JVM starts up --> When you start running program
		// Maximum size oof this heap is set to be 64MB, // -Xmx = 
		
		//String --> Literal
		/*String str10= "sri";
		String str20= "sri";
		
		String s10 = new String("sri");
		String s20 = new String("sri");
		
		System.out.println(str10==str20);
		System.out.println(str10.equals(str20));
		
		System.out.println("with new keyword : "+s10==s20);
		System.out.println("with new keyword : "+s10.equals(s20)); */
		// when you say == it compares object refernece
		// when you say .equals compares the value
		//use literals --> Always use .equals to compare it
		
	 
		//10 Minutes --> 	Will catch up 12:30PM IST with solution 
		//Write a java program to reverse the content of a sentence without 
		//using reverse keyword
		//	1-->  input = "Hi I am srinidhi"  output = "srinidhi am I Hi"
		//  2-->  input = "Hi I am srinidhi"  output = "ihdinirs ma I iH"

		// 1. Word position should be changed
		// 2. Figure out the word--> by looking into spaces 
		// 3. If there is then you will consider this as word
//					   0  1  2    3 
		String sInput="Hi I am srinidhi";
		//if you have to put multiple string into a single variable
		String[] sArrInput=sInput.split(" ");
		/*for(String str:sArrInput)
			System.out.println(str);*/
		for(int k=(sArrInput.length-1);k>=0;k--)
		{
			//System.out.print(sArrInput[k]+" ");
			char[] temp=sArrInput[k].toCharArray();
			System.out.println("***************\n");
			for(int j=(temp.length-1);j>=0;j--)
			{
				System.out.print(temp[j]);
				
			}	
		}
		
		//2-->  input = "Hi I am srinidhi"  output = "ihdinirs ma I iH"
		
		String sInputTwo="Hi I am srinidhi";
		char[] cInput = sInputTwo.toCharArray();
		for(int i=cInput.length-1;i>=0;i--)
		{
			System.out.print(cInput[i]);
		}
	}
	
	
	// Going forward you will be getting invite form deekshith for 
	//every class before 5PM on the previous day
	//

}
