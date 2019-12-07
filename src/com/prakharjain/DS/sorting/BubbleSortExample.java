package com.prakharjain.DS.sorting;

public class BubbleSortExample {
	
	/*public static void BubbleSort(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
	}
	*/
	
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
            for(int j=1; j < (n-i); j++)
            {  
                if(arr[j-1] > arr[j])
                {  
                     //swap elements  
				 temp = arr[j-1];  
                 arr[j-1] = arr[j];  
                 arr[j] = temp;  
                }  
                          
            } 
            System.out.println("I:"+i);
            print(arr);
         }  
	}
	/*public static void swap(int[] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	*/
	public static void print(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = new int[] {100,10,20,22,11,15,8,40,4,-4,2,40,0};
		bubbleSort(arr);
		print(arr);
		
	}
}
