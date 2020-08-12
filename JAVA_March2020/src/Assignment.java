
public class Assignment {

	public static void main(String[] args) {
		
		
		//How to find duplicate charachter in string
		How_to_find_duplicate_charachter_in_string();
		
	}

	private static void How_to_find_duplicate_charachter_in_string() {
		//String sInputDuplicateString =  "abcdabceabcf"; //dhiiinrs
		
				//String sInputDuplicateString =  "indnia"; //dhiiinrs 
				//char <=a >=z i empty  
				/*1. converted into charachter array
				2. for loop --> index of the charachter
				3. inner loop --> If dup present prints that charachter then set it 0(zero)
				*/ //List<>
				String sInputDuplicateString =  "abc dab ceabcf"; //dhiiinrs
				char[] cDupeString = sInputDuplicateString.toCharArray();
				//== compare address only for STRING ---> 0
				for(int firstLoop=0;firstLoop<cDupeString.length;firstLoop++) {
					int dupCount=1;
					boolean bDupValuFound = false;
					//System.out.println("loop Count : "+firstLoop+"/t Charchter : "+cDupeString[firstLoop]);
					if(cDupeString[firstLoop]!=0) {
					for(int secLoop=firstLoop+1;secLoop<cDupeString.length;secLoop++) {
					if(cDupeString[firstLoop]==	cDupeString[secLoop])
					{
						//System.out.println(cDupeString[secLoop]);
						cDupeString[secLoop]=0;
						bDupValuFound=true;
						dupCount++;
						//break;
					}
					}}
					if(bDupValuFound)
						System.out.println("Duplicate Count of charchter :: "+cDupeString[firstLoop]+" == "+dupCount);
				}
				

		
	}

}
