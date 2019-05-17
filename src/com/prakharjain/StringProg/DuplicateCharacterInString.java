package com.prakharjain.StringProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class DuplicateCharacterInString {
	public static void main(String[] args)
	{
		String str = "Kobe Is is The the best player In in Basketball basketball game .";
		List<String> list = new ArrayList<>(Arrays.asList(str.split("\\s")));

		System.out.println(list);
		// the actual operation
		TreeSet<String> seen = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		list.removeIf(s -> !seen.add(s));

		// just for debugging
		System.out.println(String.join(" ", list));
	}
}
