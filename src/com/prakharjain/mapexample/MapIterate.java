package com.prakharjain.mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterate {
	
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("Amit", 32);
			map.put("Prakhar", 31);
			map.put("Moda", 1);
			map.put("Ram", 21);
			
					
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry =  (Entry<String, Integer>) itr.next();
			System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
			
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key Entry: "+entry.getKey()+", Value:"+ entry.getValue());
		}
		
		System.out.println("KeySet: "+map.keySet());
		for(String key:map.keySet())
		{
			
			System.out.println("Key: "+key+", Value: "+map.get(key));
		}
		
		System.out.println("Map:"+map);
		
	}
}
