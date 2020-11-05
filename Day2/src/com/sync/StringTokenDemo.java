package com.sync;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to JAVA World, We are learning Core JAVA";
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
