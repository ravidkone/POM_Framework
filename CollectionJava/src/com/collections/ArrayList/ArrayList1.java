package com.collections.ArrayList;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Normal Array
		String[] strArr= {"sri","Nidhi","abhi"};
		
		//List<String> li = new List<String>();
		ArrayList<String> aList =  new ArrayList<>();
		//List<String> aList = new ArrayList<String>();
		//1,2,3,4,5,6 --> Split by commar --> [] --> for loop --> you use list.add()
		aList.add("Sri");//
		aList.add("Nidhi");
		aList.add("abhi");  //-->
		System.out.println(aList);
		//aList.add(null);
		aList.add("Vinod");
		aList.add(2,"Kumar");
		aList.remove(0);
		System.out.println(aList);
		aList.set(2, "Srinidhi");
		System.out.println(aList);
		System.out.println(aList.indexOf("Srinidhi"));
		System.out.println(aList.size());
		System.out.println(aList.contains("Srinidhi"));
		//System.out.println(aList);//--> Think this is printing object value
		//aList.clear();
		aList.add("Anu");
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
		/*for(int i=0; i< aList.size();i++)
		{
			System.out.println(aList.get(i));
		}*/
		/*Iterator<String> It = aList.iterator();
		while(It.hasNext()) {
			if(It.next().equals("Srinidhi")) {
				///
				System.out.println("I found");
			}
			//System.out.println(It.next());
		}
	*/	
		
	}
/*
 1. Add is used to add element to array. aList.add
 2. aList.add(2,"Kumar")
 3. aList.remove to remove any value inside List
 4. By giving index we can also remove it - aList.remove(0);
 5. Set to update the element
 6. 
 * */
}
