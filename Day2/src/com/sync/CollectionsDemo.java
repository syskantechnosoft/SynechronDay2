package com.sync;

import java.util.Arrays;

import cm.syn.Employee;

public class CollectionsDemo {
	public static void main(String[] args) {
		int x=10;
		int y[] = new int[5]; // 001,005,009,013,017
		y[0]=25;
		y[1]=34;
		y[2]=7;
		y[3]=74;
		y[4]=2;
		
		int z[]= {5,8,9,23,1,75,98};
		//Arrays in java homogeneous
		System.out.println("z[4] is :"+ z[4]);
		
		Object obj = new Object();
		
		Object objArray[]= new Object[5];
		
		Employee emp = new Employee();
		//heterogenous 
		Object objArray1[]= {23, 45.76f, emp, "Welcome", true, 67.9867};
		
		Arrays.sort(z);
		
		Arrays.sort(objArray1);
		
		for (Object object : objArray1) {
			System.out.println(object);
		}
		
	}
}
