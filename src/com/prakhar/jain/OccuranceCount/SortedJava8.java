package com.prakhar.jain.OccuranceCount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class SortedJava8 {
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> l = new ArrayList<>();
		
		l.add("AAAAA");
		l.add("ABB");
		l.add("DAAAA");
		l.add("CAAAA");
		
		
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(21);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		List<Integer> list2 = list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		List<Integer> list3 = list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> list4 = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		
		Consumer<Integer> c1=i->{
			System.out.println("The Square of"+i+"is "+(i*i));
			
		};
		list.stream().forEach(c1);
		
		list.stream().forEach(i->{
			System.out.print("The Square of"+i+"is "+(i*i));
		});
		//list.stream().forEach(System.out::println);
		Comparator<String> c = (s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> list5 = l.stream().sorted(c).collect(Collectors.toList());
		//List<Integer> list6 = list.stream().sorted(c)
		long noOfFailedStudents = list.stream().filter(m->m<40).count();
		System.out.println(noOfFailedStudents);
		List<Integer> updatedMarks = list.stream().map(i->i+5).collect(Collectors.toList());
		String min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer minInt = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(updatedMarks);
		System.out.println(list1);
		System.out.println(list2);
	}
}
