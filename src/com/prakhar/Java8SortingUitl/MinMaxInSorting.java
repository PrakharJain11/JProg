package com.prakhar.Java8SortingUitl;

import java.util.ArrayList;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MinMaxInSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(8);
		list.add(12);
		list.add(8);
		list.add(1);
		list.add(100);
		list.add(22);
		
		System.out.println("Min: "+list.stream().min((i1,i2)-> i1.compareTo(i2)));
		System.out.println("Max: "+list.stream().max((i1,i2)-> i2.compareTo(i1)));
		System.out.println("Min: "+list.stream().min((i1,i2)-> -i1.compareTo(i2)));
		System.out.println("Max: "+list.stream().max((i1,i2)-> -i2.compareTo(i1)));
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println(list.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList()));
		
		list.stream().forEach(System.out::println);

	}

}
