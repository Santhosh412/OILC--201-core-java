package com.arrays;
import java.lang.reflect.Array;
import java.util.*;
public class SortArray {
	static String getSortingOder(int arr[])
	{
		String res ="";
	for (int i = 0; i < arr.length; i++)   
	{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
			int temp = 0;  
			if (arr[i] > arr[j])   
			{  
				temp = arr[i];  
				arr[i] = arr[j];  
				arr[j] = temp;  
			}  
		}   
		res += arr[i]+" ";
	}  
	return res;
}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int arr[] = new int[10];
		System.out.println("Enrer 10 numbers");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(getSortingOder(arr));
	}

}
