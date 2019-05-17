package com.prakharjain.sorting;
import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.id - emp2.id;
	}

}
