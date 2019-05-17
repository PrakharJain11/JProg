package com.prakhar.MapSort;

import java.util.TreeMap;

public class MapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm = new TreeMap<Integer, String>((I1,I2)->(I1>I2)?-1:(I2>I1)?1:0);
		tm.put(1, "Ram");
		tm.put(10, "Krishna");
		tm.put(5, "Gopu");
		tm.put(2, "ramu");
		tm.put(20, "Lalu");
		tm.put(4, "Lavia");
		tm.put(10, "Chutku");
		tm.put(100, "Kali");
		
		System.out.println(tm);
		
	}

}
