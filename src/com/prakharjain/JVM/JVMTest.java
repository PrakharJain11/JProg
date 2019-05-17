package com.prakharjain.JVM;

import java.lang.reflect.Method;
import com.prakharjain.JVM.Student;

public class JVMTest {
	
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		int count = 0;
		Class c = Class.forName("com.prakharjain.JVM.Student");
		Method[] m = c.getDeclaredMethods();
		for (Method method : m) {
			count ++;
			System.out.println(method.getName());
		}
		
		System.out.println(count);
		Student s1 = new Student();
		Class c1 = s1.getClass();
		
		Student s2 = new Student();
		Class c2 = s2.getClass();
		
		if(c1 == c2)
		{
			System.out.println("Same");
		}
		
	}
	
}
