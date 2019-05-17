package com.prakhar.ObjectSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectSort {
	
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(1, "Ram");
		
		System.out.println(emp1);
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(new Employee(10,"Krishna"));
		list.add(new Employee(8,"Kali"));
		list.add(new Employee(4,"Krishna"));
		list.add(new Employee(10,"Ramu"));
		list.add(new Employee(10,"Lalu"));
		//Collections.sort(list<T>);
		System.out.println(list);
		//Collections.sort(list, (e1,e2)-> (e1.ename-e2.ename)?-1:(e1.ename-e2.ename)?1:0);
		//Collections.sort(list, (e1,e2)->());
		
		//System.out.println(list);
	}
}	
