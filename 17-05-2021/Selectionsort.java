package com;
import java.util.*;
public class Selectionsort {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  values");
		int array[] = new int[5];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		dispElementsInArray(array);
		sortAnArray(array);
	}
	static void dispElementsInArray(int arr[]) {
		System.out.println("Array elemts as folloein");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	static void sortAnArray(int arr[]) {
		int size = arr.length;
		int temp;
		System.out.println("\n sorting array using selenction sort/n");
		for(int i = 0; i < size; i++)
		{
			for(int j = i+1; j < size; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		dispElementsInArray(arr);
	}

}
