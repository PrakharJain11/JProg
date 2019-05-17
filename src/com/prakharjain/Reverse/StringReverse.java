package com.prakharjain.Reverse;

public class StringReverse {
	
	static String rev1="";
	private static String rev(String rev)
	{
			
		if(rev.length() == 1)
			{
				return rev;
			}
			else
			{
				rev1 += rev.charAt(rev.length()-1)+rev(rev.substring(0, rev.length()-1));
			}
		
		
		return rev1;
	}
	
	public static void main(String[] args)
	{
		//StringReverse.rev("ItsJava");
		System.out.println(StringReverse.rev("ItsJava"));
		String str1 = "abc";
		String str2 = "def";
		String xyz = str1 + str2;
		System.out.println(xyz);
		
	}
}
