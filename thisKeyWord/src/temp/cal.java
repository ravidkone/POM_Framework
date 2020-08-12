package temp;

public class cal {

	int a =50;
	String sName="Nidhi";
	
	int add(int a , int b){
		System.out.println(a);
		return this.a+b; 
		//this keyword will refer to the variable 
		//which is there in that class. global variable
	}

	public String setName(String sName) {
		//this.sName=sName;
		return sName+this.sName; 
	}
}
