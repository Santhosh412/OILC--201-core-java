package com.arrays;

import java.util.Scanner;

public class DisplayEvenNumber {

	public static void getEvenNumber(int[] arr) {

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values");
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		getEvenNumber(arr);
	}
	
}
