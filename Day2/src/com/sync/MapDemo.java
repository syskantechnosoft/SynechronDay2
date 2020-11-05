package com.sync;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// Map will not maintain insertion order, no duplicate keys
		Map myMap = new HashMap();
		myMap.put(91,"India");
		myMap.put(65,"Singapore");
		myMap.put(94, "SriLanka");
		myMap.put(971, "Dubai");
		myMap.put(91,"India");
		myMap.put(98,"India");
		myMap.put(null,"India");
		myMap.put(null, "SriLanka");
		myMap.put(99,null);
		myMap.put(199,null);
		
		System.out.println("myMap :"+myMap);
		
		Set keySet= myMap.keySet();
		System.out.println("keySet : "+keySet);
		
//		for (int i=0;i<keySet.size();i++) {			
//			System.out.println(myMap.get(keySet));
//		}
		System.out.println("Using Iterator & while loop");
		Iterator itr = keySet.iterator();
		while(itr.hasNext()) {
			System.out.println(myMap.get(itr.next()));
		}
		System.out.println("Using Enhanced for loop");
		for (Object object : keySet) {
			System.out.println(myMap.get(object));
		}
	}

}
