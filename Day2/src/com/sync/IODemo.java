package com.sync;

public class IODemo {
	
	//this is instance variable (state)
	private int sample;
	//this is member method (behavior)
	public void printSample() {
		System.out.println("value of sample :" +  sample);
	}
	
	//serialization - process of storing the state in file systems
	
	public int getSample() {
		return sample;
	}


	public void setSample(int sample) {
		this.sample = sample;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IODemo obj = new IODemo();
		obj.printSample();
		obj.setSample(5);
		obj.printSample();
	}

}
