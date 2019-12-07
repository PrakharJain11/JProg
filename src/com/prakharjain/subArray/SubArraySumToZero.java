package com.prakharjain.subArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SubArraySumToZero {
	
	public int[] zeroSum(int[] arr)
	{
		HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Amit");
		list.add("Ramya");
		list.add("Ram");
		list.add("Kirti");
		list.add("Gudia");
		list.add("Ritu");
		
		for(int i=0; i<list.size();i++)
		{
			System.out.println("List:"+list.get(i));
		}
		
		Set<String> set = new HashSet<String>();
		
		boolean b = set.add("Ramya");
		boolean b1=set.add("Amit");
		boolean b2=set.add("Ramya");
		
		
		
		
		/*int sum = 0;
		for(int i =0; i<= arr.length; i++)
		{ 
			Integer oldIndex = sums.get(sum);
			if(oldIndex == null && i == arr.length)
				return null;
			else if(oldIndex == null)
			{
				sums.put(sum, i);
				sum += arr[i];
			}
			else
			{
				return Arrays.copyOfRange(arr, oldIndex, i);
			}
		}
*/		return null;
	}

	public static void main(String[] args)
	{
		SubArraySumToZero obj = new SubArraySumToZero();
		int[] arr = {2,3,-3,-4,5};
		System.out.println(obj.zeroSum(arr)[0]);
		System.out.println(obj.zeroSum(arr)[1]);
	}
}
