package boxingUnboxing;

public class entry {
	/*
Primitive type	Object
boolean	        Boolean
byte	        Byte
char	        Character
float	        Float
int	            Integer
long	        Long
short	        Short
double	        Double

	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//both int and float are primitive datatype
		int i=50;
		float f=0;
		
		//
		Integer j=10;
		Float f2;
		int[] iArr= {2,4,5}; //--
		
		// Boxing or Autoboxing:: conversion of primitive datatype to an object --> java will do it by default
		//case1
		boxingMethod(i);//int primitive datatype
		//case2
		Integer j2=10;
		j2=i;
		// i will cover this when it comes to collection
		
		// Un-Boxing :: conversion of object to its primitive datatype --> java will do it by default
		//case1
		Integer objNum = new Integer(100);
		unboxingMethod(objNum);//
		
		//case2
		Integer objNum2= new Integer(5);
		int num2=objNum2;
		
		System.out.println(num2);
		
		/*int k=30;//Integer 
		shMetho(k);
		
		Integer p = new Integer(200);
		unboxingMethod(p);*/
	}
	
	static void shMetho(Integer m) {//
		System.out.println(m);
	}
	 static void unboxingMethod(int i) {
		System.out.println(i);
		
	}

	static void boxingMethod(Integer num) { //Integer object --> boxing 
		System.out.println(num);
	}
	//11:47AM PST
}
