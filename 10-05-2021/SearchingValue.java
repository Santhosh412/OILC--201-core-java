package com.arrays;

import java.util.Scanner;

public class SearchingValue {

	static int getPosition(int  num, int arr[] )
	{
		int res = 0;
		for( int i = 0 ; i < arr.length ; i++)
		{
			if(num == arr[i])
			{
				res += (i+1);
			}
		}
		return res ;
	}
	
	public static void main(String args[])
	{
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ten values : ");
			int arr[] = new int[5];
			for(int i = 0 ; i < arr.length ; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter a number to search : ");
			int num = sc.nextInt();
			System.out.println(num + " is found at the INDEX " + getPosition(num,arr) );
		}
		

}
}