package com.collections.linkedList;

public class Student implements Comparable<Student>{

	public String sName;
	public int iId;
	
	public Student(String name, int id) {
	this.sName=name;
	this.iId=id;
	}

	@Override
	public int compareTo(Student obj) {
		//0, -ve, +ve
		return this.iId - obj.iId;	//-->1,2,3,3,4,6,7 //1,5,4,2
		//return obj.iId - this.iId;  --> For reverse order
	}
}
