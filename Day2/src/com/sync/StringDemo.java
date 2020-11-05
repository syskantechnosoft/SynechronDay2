package com.sync;

import cm.syn.Employee;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello World";  // primitive declaration
		int a=5;
		//Employee emp = {5,"Test"};
		String s2= new String("Hello World"); // Object declaration 
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("s1 hashcode :" + s1.hashCode());
		System.out.println("s2 hashcode :" + s2.hashCode());
		
		System.out.println("At 4 :"+s1.charAt(10));
		System.out.println("substring :"+s1.substring(0,4));
		
		System.out.println("uppercase :"+ s1.toUpperCase());
		System.out.println("LowerCase :"+ s1.toLowerCase());
		
		System.out.println("s1 hashcode :" + s1.hashCode());
		System.out.println("s2 hashcode :" + s2.hashCode());
		
		
	}

}
