package com.prakharjain.Comparator1;

import java.util.Comparator;

public class CompositeComparator implements Comparator<Employee> {
	
	public int compare(Employee emp1, Employee emp2)
	{
		if(emp1.getBU().equals(emp2.getBU()))
		{	
			if(emp1.getDept().equals(emp2.getDept()))
			{
				return emp1.getName().compareTo(emp2.getName());
			}	
			else
			{
				return emp1.getDept().compareTo(emp2.getDept());
			}
			
		}
		else
		{
			return emp1.getBU().compareTo(emp2.getBU());
		}
		
	}
}
