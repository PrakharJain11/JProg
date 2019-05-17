package com.prakhar.CustomSorting;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		if(arg0>arg1)
		{
			return -1;
		}
		else if(arg1<arg0)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
	//return (I1>I2)?-1:(I1<I2)?1:0;
	
}
