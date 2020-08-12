package com.collections.Hashmap;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(10, "B");
		hm.put(15, "A");
		hm.put(12, "C");
		hm.put(18, "E");
		hm.put(14, "D");
		System.out.println(hm);
		//hm.remove(15);
		System.out.println(hm);
		hm.put(14, "Z");
		System.out.println(hm);
		hm.put(16, "A");
		System.out.println(hm);
		//hm.clear();
		System.out.println(hm);
		HashMap<Integer, String> hSri = new HashMap<Integer, String>();
		System.out.println("hSri == "+hSri);
		hSri.putAll(hm); // --> similar copy of hSri 
		System.out.println("hSri == "+hSri);
		HashMap<Integer,String> mapClone = new HashMap<Integer, String>();
		System.out.println("mapClone == "+mapClone);
		mapClone=(HashMap<Integer, String>) hSri.clone(); // shallow copy
		System.out.println("mapClone == "+mapClone);
		//Hashmap is an unordered list
		// HashMap by using hm.put you can add an key value pair
		// Key value pair. Duplication is not possible. if you add same key it will overrite the existing value
		//
		//A shallow copy is a copy of the reference pointer to the object, 
		//whereas a deep copy is a copy of the object itself. 
		
	}

}
