package com.prakhar.CustomSorting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestComparator {
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(2);
		l.add(40);
		l.add(15);
		l.add(22);
		
		Collections.sort(l, new MyComparator());
		System.out.println(l);
		
		
	}
}
