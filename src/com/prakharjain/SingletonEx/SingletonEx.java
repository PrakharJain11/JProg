package com.prakharjain.SingletonEx;

public class SingletonEx {
	
	public static SingletonEx singletonObj;
	
	private SingletonEx()
	{
		System.out.println("Instance created");
	}
	
	public static SingletonEx getInstance()
	{
		if(singletonObj == null)
		{
			singletonObj = new SingletonEx(); 
		}
		return singletonObj;
	}
	
	
	
}
