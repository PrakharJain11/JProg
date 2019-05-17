package com.prakharjain.DS;

public class BubbleSort {
	
	public static void bubbleSort(int array[])
	{
		int n = array.length;
		int k;
		for(int m=n; m>=0; m--)
		{
			for (int i=0; i<n-1; i++)
			{
				k=i+1;
				if(array[i]<array[k])
				{
					swapNumbers(i,k,array);
				}
			}
		}
		printNumbers(array);
	}
	public static void swapNumbers(int i, int j, int[] array)
	{
		int temp;
		temp =array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void printNumbers(int[] input)
	{
		
	}
	
	public static void main(String[] args)
	{
		int[] input = {4,2,1,2,5,2,3,4,5,4,4,2,10,8,20};
		
	}

}
