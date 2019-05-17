package com.prakhar.SetSorting;

import java.util.TreeSet;

public class TestComparator {
	
	public static void main(String[] args)
	{
	TreeSet<Integer> t = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
	t.add(10);
	t.add(20);
	t.add(5);
	t.add(15);
	t.add(22);
	t.add(4);
	t.add(24);
	t.add(51);
	t.add(2);
	t.add(12);
	
	System.out.println(t);
	
	}
	
}
