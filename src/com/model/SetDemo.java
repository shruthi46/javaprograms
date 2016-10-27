package com.model;

import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args)
	{
		Set<Integer> l=new <Integer>();
		
		l.add(new Integer(111));
		l.add(new Integer(222));
		l.add(new Integer(333));

		Iterator<Integer> i=l.iterator();
		while(i.hasNext())
		{
			Integer obj=i.next();
			System.out.println(obj);
		}
	
	}

}
