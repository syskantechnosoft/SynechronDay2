package com.sync;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set will not maintain insertion order, no duplicates, null is allowed
		Set set = new HashSet();
		
		set.add(45);
		set.add(56);
		set.add(75);
		set.add(56);
		set.add(null);
		Set subSet = new HashSet();
		subSet.add(23);
		subSet.add(null);
		subSet.add(12);
		subSet.add(23);
		set.addAll(subSet);
		
		System.out.println(set.size());
		System.out.println(subSet.remove(21));
		subSet.clear();
		System.out.println("Check Empty :"+subSet.isEmpty());
	}

}
