package com.prakharjain.TeluskoComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("Asus",2,520));
		laptop.add(new Laptop("Sony",4,1024));
		laptop.add(new Laptop("Dell",1,360));
		laptop.add(new Laptop("Lenovo",8,520));
		
		Collections.sort(laptop);
		for (Laptop laptop2 : laptop) {
			System.out.println(laptop2.brandName);
		}
		
	}

}
