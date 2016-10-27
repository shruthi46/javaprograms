package com.test;
import com.model.Employee;

public class TestEmployee {
	public static void main (String args[])
	{
		Employee e=new Employee();
		e.setEmpid(123);
		e.setName("shruthi");
		e.setSsn("xyz");
		e.setSalary(20000);
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSsn());
		System.out.println(e.getSalary());
		
		
	}

}
