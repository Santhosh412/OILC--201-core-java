package com;
import java.util.*;
public class ShellSort {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements into array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		displayNum(arr);
		shellSort(arr,n);
		
	}
	static void displayNum(int num[])
	{
		System.out.println("the given elements are..");
		for(int i = 0; i < num.length; i++)
		{
			System.out.println(num[i]+ " ");
			
		}
		System.out.println(" ");
	}
	
	static void shellSort(int[] arr, int num) {
		for(int gap = num / 2; gap > 0; gap /= 2)
		{
			for(int j = gap; j < num ; j++) 
			{
				for(int i =(j - gap); i >= 0; i -= gap)
				{
					if(arr[i + gap] >= arr[i])
						break;
					else {
						int temp = arr[i];
						arr[i] = arr[i + gap];
						arr[i + gap] = temp;
					}
				}
			}
		}
		System.out.println("After sorting the elemts are...");
		for(int x : arr)
		{
			System.out.println(x+" ");
		}
	}
	
}
