package com.prakharjain.StringEx;

import java.util.stream.IntStream;

public class PalindroneEx {

	
	public boolean isPalindromeUsingIntStream(String text) {
	    /*
		int len = text.replace("a","");
		for(int i = 0; i<len; i++)
		{
			if(text.charAt(i) == text.charAt(len-i-1))
			{
				
			}
			else
			{
				return false;
			}
		}
		*/
		return false;
	}
		public static void main(String[] args)
		{
			
			PalindroneEx pe = new PalindroneEx();
			System.out.println(pe.isPalindromeUsingIntStream("Nitin"));
			//pe.isPalindromeUsingIntStream("Nitin");
				
		}
}

