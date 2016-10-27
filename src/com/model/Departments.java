package com.model;
import com.model.Employee1;
//inheritance
public class Departments extends Employee1
{
	private String deptName;

	public Departments(int empid, String name, String ssn, double salary, String deptName) {
		super(empid, name, ssn, salary);
		this.deptName = deptName;
	}
	public void show()
	{
		System.out.println("deptname:"+deptName);
	}

}
