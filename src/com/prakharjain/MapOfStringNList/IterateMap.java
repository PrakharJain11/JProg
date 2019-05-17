package com.prakharjain.MapOfStringNList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMap {

	public static void main(String[] args)
	{
		HashMap<String, List<Person>> map = new HashMap<>();
		
		ArrayList<Person> person = new ArrayList<>();
		person.add(new Person(1,"Ram"));
		person.add(new Person(2,"Krishna"));
		
		ArrayList<Person> person1 = new ArrayList<>();
		
		person1.add(new Person(1,"Ram1"));
		person1.add(new Person(2,"Krishna1"));
		
		map.put("101", person);
		map.put("101", person1);
		
		for (Entry<String, List<Person>> item : map.entrySet()) {
			
			for (Person person2 : item.getValue()) {
				System.out.println(person2.getName());
			}
			//System.out.println(item.getKey()+"Value: "+item.getValue().get(0).getName());
		}
		
	}
}
