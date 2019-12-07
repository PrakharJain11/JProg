package com.prakharjain.builder;

import java.util.Arrays;
import java.util.List;

public class Shop {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		
		
		//Phone p = new Phone("Android", 2,"Qualcomm",5.5,3100);
		Phone p = new PhoneBuilder().setOs("Android").setRam(8).getPhone();
		System.out.println(p);
		
		try { 
			  
            // creating Arrays of String type 
            String a[] = new String[] { "A", "B", "C", "D" }; 
  
            // getting the list view of Array 
            List<String> list = Arrays.asList(a); 
  
            // printing the list 
            System.out.println("The list is: " + list); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
	
	}
}
