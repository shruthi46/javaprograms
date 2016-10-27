package com.test;
import com.model.Vehicle;

public class Bike extends Vehicle {
	
	public void run()
	{
		System.out.println("bike is running safely");
	}
	public static void main(String args[])
	{
		
		Bike b=new Bike();
		b.run();
	}

}
