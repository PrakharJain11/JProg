package com.prakharjain.adapter;

import com.prakharjain.krishna.PilotPen;

public class School {
	
	public static void main(String[] args)
	{
		PilotPen pp = new PilotPen();
		AssignmentWork aw = new AssignmentWork();
		Pen p = new PenAdaptor();
		
		aw.setP(p);
		aw.writeAssignment("I am tired");
	}
}
