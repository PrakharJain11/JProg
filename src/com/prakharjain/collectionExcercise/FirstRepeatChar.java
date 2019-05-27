package com.prakharjain.collectionExcercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class FirstRepeatChar {
	public static void main(String[] args) {
		String str = "I love Java I";
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		list.sub
		
		HashMap<Character, Integer> map = new LinkedHashMap();
		for(char c:str.toCharArray())
		{
			//map.containsKey(c)?map.put(c, map.get(c)+1):1;
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
	}
}
