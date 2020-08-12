
public class Day3_Arrays {

	public static void main(String[] args) {
		//arrays can be done for any of the datatype
		String car = "ford";
		String[] cars = {"Mercedes", "Audi", "BMW","Tesla"};
		
		int[] iArrNum = {1,2,3,4,5};
		System.out.println(iArrNum[2]);
		iArrNum[4]=55;
		System.out.println(iArrNum[4]);
		System.out.println(cars[2]);
		//System.out.println(cars[10]);
		System.out.println(cars.length);
		
		// Multi Dimensional Array = Containing more than one array , Array of an array
	
		/*
		 		Collumn			
		0	1	2	
Row	0	1	2	3	
	1	4	5	6	
					
					
		0,0	1		
		0,1	2		
		1,1	5		
					 
		 * */
		//				   0	   1	   2      3       4
		/* row and collumn
		int[][] iArr = {{1,2,3},{4,5,6},{7,8,9},{22,33},{44,67}};
		System.out.println(iArr[0][0]);
		System.out.println(iArr[1][1]);
		System.out.println(iArr[0][2]);
		System.out.println(iArr[4][1]);
		
		System.out.println(iArr.length);
		System.out.println(iArr[1].length);
		System.out.println(iArr[2]);
		*/
		
		// Strings --> literal, with new key word
		// Difference b/w .equals and ==
		// Why is String immutable
		// Static vs Non Static variables and Methods
		// Why is Main method Static
		 
		
		
	}

}
