package com.prakharjain.StringEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringReverse {
	
	/*public void stringReverse(String str)
	{
		
		if(str == null || (str.length()<=1))
		{
			System.out.println(str);
		}
		else
		{
			System.out.println("Length:"+str.length());
			System.out.print(str.charAt(str.length()-1));
			stringReverse(str.substring(0,str.length()-1));
		}
	}
*/	
	public static String reverse(String orig)
	{
	    char[] s = orig.toCharArray();
	    final int n = s.length;
	    final int halfLength = n / 2;
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
	    return new String(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234567";
		
		/*Map<String, Integer> map = new HashMap<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(1);
		//int i = list.set(1, 10);
		
		System.out.println(list.get(1));
		*/	
		StringReverse obj = new StringReverse();
		//obj.stringReverse(str);
		System.out.println(obj.reverse(str));
		//System.out.println(str);
	}

}
