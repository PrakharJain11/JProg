package com.prakharjain.StringEx;

public class PermEx {
	
	private void Permute(String str, int fi, int li)
	{
		if(fi == li)
		{
			System.out.println(str);
		}
		else
		{
			for(int i = fi; i<li; i++)
			{
				str = swap(str,fi,li);
				
			}
		}
	}
	
	public String swap(String a, int i, int j)
	{
		char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 	
	}
	
	public static void main(String[] args)
	{
		String str = "ABC";
		int lenght = str.length();
		
		PermEx permEx = new PermEx();
		
	}
}
