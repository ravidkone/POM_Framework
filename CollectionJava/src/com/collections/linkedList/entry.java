package com.collections.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class entry {

	public static void main(String[] args) {
		
		
		LinkedList<Student> liStudent= new LinkedList<>();
		liStudent.add(new Student("Srinidhi", 14));
		liStudent.add(new Student("Sri", 5));
		// Student class has custom data types means, Name and ID
		// To this we aadding/Setting the values using LinkedList add method
		Iterator<Student> It = liStudent.iterator();
		while(It.hasNext()) {
			Student temp = It.next();
				System.out.println("I found ID :: "+temp.iId+"\t Name :: "+temp.sName);
			
		}
		Collections.sort(liStudent);
		
		Iterator<Student> It1 = liStudent.iterator();
		while(It1.hasNext()) {
			Student temp = It1.next();
				System.out.println("I found ID :: "+temp.iId+"\t Name :: "+temp.sName);
		}
		
		//We are coming back around 12:15PM PST
		
		//File read and write
		//Loading property files
		//Overview of Threads
		//Reading Excel sheets
	}

}
