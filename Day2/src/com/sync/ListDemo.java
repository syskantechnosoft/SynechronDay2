package com.sync;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		//interface reference holding object of implementation class
		//list accepts duplicate values, null is allowed, it will not maintain order
		list.add("India");
		list.add("China");
		list.add(null);
		list.add("Pak");
		list.add("srilanka");
		list.add("India");
		list.add("Pak");
		list.add(null);
		
		System.out.println("My Arraylist content :"+ list);
		//normal for loop
		System.out.println("Using Normal for Loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Using Enhanced for Loop");
		// enhanced for loop -- foreach
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println("Using Iterator");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List linkedList = new LinkedList();
		linkedList.add("India");
		linkedList.add("China");
		linkedList.add(null);
		linkedList.add("Pak");
		linkedList.add("srilanka");
		linkedList.add("India");
		linkedList.add("Pak");
		linkedList.add(null);
		
		System.out.println("My Linked list content :"+linkedList);
	}

}
