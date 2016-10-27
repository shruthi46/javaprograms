package com.test;
import com.model.Statistics;

public class MethodOverloading {
	
	public static void main(String args[])
	{
		Statistics s=new Statistics();
		System.out.println("average of two numbers is:" +s.average(10,20));
		System.out.println("average of three numbers is:" +s.average(10,20,30));
		System.out.println("average of four numbers is:" +s.average(10,20,30,40));
	}

}
