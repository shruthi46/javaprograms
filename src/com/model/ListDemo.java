package com.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo extends ArrayList implements List
{
	public static void main(String[] args)
	{
		
		ArrayList l=new ArrayList();
		l.add("shruthi");
		l.add(new Integer(111));
		l.add(new Double(111));
		l.add(new Double(111));
		l.add(new Float(111));
		l.add("null");
		l.add("shruthi");
		System.out.println("hello"  + l.get(2));
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		
	
	}

}



















/*class ListDemo
{
	
	 public static void main(String args[]){  
	   
	  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
	  al.add("Ravi");//adding object in arraylist  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	} */







