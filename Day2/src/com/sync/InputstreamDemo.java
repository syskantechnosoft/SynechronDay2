package com.sync;

import java.io.IOException;
import java.io.InputStreamReader;



public class InputstreamDemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Please Enter a number");
		int a=0;
		a=isr.read();
		System.out.println("The Entered number is :" + a );
		
		char c = 'a';
		char c1= 54;
		System.out.println("c="+c+"\t c1="+c1);
		isr.close();
	}

}
