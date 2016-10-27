package com.test;
import com.model.Product;

public class ProductTest 
{
	
public static void main(String args[])
{
	Product p1 =new Product();
	
	
	p1.setId(10);
	p1.setName("samsung");
	p1.setDescrption("mobile");
	p1.setPrice(10000.00);
	System.out.println(p1.getId());
	System.out.println(p1.getPrice());
	System.out.println(p1.getDescrption());
	System.out.println(p1.getName());
		
		
	}

}
