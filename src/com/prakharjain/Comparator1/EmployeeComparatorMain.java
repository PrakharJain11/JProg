package com.prakharjain.Comparator1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorMain {
	
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Ram","IT","BFSC");
		Employee emp2 = new Employee("Shayam","Tech","Chemical");
		Employee emp3 = new Employee("Aniket","Facility","FMCG");
		Employee emp4= new Employee("Vijay","IT","Technical");
		Employee emp5 = new Employee("Vikas","IT","BFSC");
		Employee emp6 = new Employee("Lavi","Tech","Chemical");
		Employee emp7 = new Employee("Avi","Facility","FMCG");
		Employee emp8 = new Employee("Avi","Tech","BFSC");
		Employee emp9 = new Employee("Shayam","Tech","Chemical");
		Employee emp10 = new Employee("King","Courier","FMCG");
		Employee emp11= new Employee("Vijay","IT","Technical");
		Employee emp12 = new Employee("Vikas","IT","BFSC");
		Employee emp13 = new Employee("Lavi","Tech","Chemical");
		Employee emp14 = new Employee("Avi","Facility","FMCG");
		
		List<Employee> list = new ArrayList<>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);
		list.add(emp11);
		list.add(emp12);
		list.add(emp13);
		list.add(emp14);
		
		Collections.sort(list, new CompositeComparator());
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println("Name: "+list.get(i).getName()+" Dept: "+list.get(i).getDept()+" BU: "+list.get(i).getBU());
		}
		
	}

}
