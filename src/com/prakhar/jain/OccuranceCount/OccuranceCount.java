package com.prakhar.jain.OccuranceCount;

import java.util.stream.Collectors;

public class OccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Object::toString);
		System.out.println("The quick brown fox jumped over the lazy dog.".chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Object::toString, Collectors.counting())));
	}
}
