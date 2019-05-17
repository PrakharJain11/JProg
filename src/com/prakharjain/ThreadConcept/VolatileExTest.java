package com.prakharjain.ThreadConcept;

import java.util.Scanner;

public class VolatileExTest {
	
	public static void main(String[] args)
	{
		VolatileEx volatileObj = new VolatileEx();
		volatileObj.start();
		
		Scanner scn = new Scanner(System.in);
		scn.nextLine();
		volatileObj.stopCounting();
	}
}

