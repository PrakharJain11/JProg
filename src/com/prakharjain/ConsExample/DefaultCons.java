package com.prakharjain.ConsExample;

public class DefaultCons {
	
	
	DefaultCons()
	{
		super();
		System.out.println("Default Cons Called");
	}
	
	public static void main(String[] args)
	{
		DefaultCons dc = new DefaultCons();
		System.out.println("Main Called");
	}
}
