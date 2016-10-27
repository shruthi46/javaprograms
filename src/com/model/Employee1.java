package com.model;
import com.model.Employee;

public class Employee1 
{
	private int empid;
	private String name;
	private String ssn;
	private double salary;
	public Employee1(int empid, String name, String ssn, double salary) {
		this.empid = empid;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
public void display()
{
	System.out.println("ID:" +empid);
	System.out.println("Name:" +name);
	System.out.println("ssn:" +ssn);
	System.out.println("salary:" +salary);
}

}
