package model;

import java.util.*;

public class Customer
{
	private String name;
	private ArrayList<Customer> customers;
	
	public Customer(String name)
	{
		setName("Patrick");
		customers = new ArrayList<>(100);
	}

	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}
}
