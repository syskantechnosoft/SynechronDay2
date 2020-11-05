package com.sync;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("c:\\test\\demo.txt");
		//file Write Operation
		FileWriter fw = new FileWriter(f);
		fw.write("This is file writter demo");
		fw.close();
		
		
		
		//System.out.println("\\ welcome to java \\");
		
		//File Read Operation
		FileReader fr = new FileReader(f);
		int i=0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
