package com.satyam.thiskeyword;

public class I {

	private String name;
	private String parent;
	//initialize class instance variables with local varaibles
	public I(String name, String parent) {
	
		this.name = name;
		this.parent = parent;
	}

	public void represent()
	{
		System.out.println("I am "+name);
		System.out.println("My parent is "+parent);
	}
	
	
}
