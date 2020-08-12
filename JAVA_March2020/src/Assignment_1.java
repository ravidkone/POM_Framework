
public class Assignment_1 {

	public static void main(String[] args) {
		// How to check if two strings are anagrams of each other or not
				//LISTEN = SILENT -->
				//peek = keep 
		/*	1. if the length is same then we can go forward. Directly we can say it is not anagram
			xxxx --> 2. one-one letter first string then compare it in another string.
		 */
		/* 1. if the length is same then we can go forward. Directly we can say it is not anagram
		 * 2. buble sort both the strings separately 
		 * 3. Compare both
		 * */
		/*1. if the length is same then we can go forward. Directly we can say it is not anagram
		 *2. one-one letter first string then compare it in another string--> once comparision sucess themn make 
		 *second string setting to 0
		 *3. come out of the loop and then check any nonzero items are there in second string or not
		 * 
		 * */
		
		/*
		 Q.1 How to find duplicate characters in a String? --> Done

Q2. How to check if a String contains only digits? 

Q3. How to count the number of vowels and consonants in a String?

Q4. How to count the occurrence of a given character in String? --> Done

Q5. How to check if two Strings are anagrams of each other? ---> Done

Q6. How to remove duplicate characters from String?  --> Done
//
		 
		 
		 
		 * */
		String sInputDuplicateString =  "abc dab ceabcf"; //dhiiinrs
		char[] cDupeString = sInputDuplicateString.toCharArray();
		for(int firstLoop=0;firstLoop<cDupeString.length;firstLoop++) {
			
	
			for(int secLoop=firstLoop+1;secLoop<cDupeString.length;secLoop++) {
			if(cDupeString[firstLoop]==	cDupeString[secLoop])
			{
			sInputDuplicateString=sInputDuplicateString.replace(Character.toString(cDupeString[firstLoop]),"" );
			}
		}

}
		System.out.println(sInputDuplicateString);
	}
}
