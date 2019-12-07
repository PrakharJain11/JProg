package com.prakharjain.adapter;

import com.prakharjain.krishna.PilotPen;

public class PenAdaptor implements Pen {
	
	PilotPen pp = new PilotPen();
	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		pp.mark(str);
	}

}
