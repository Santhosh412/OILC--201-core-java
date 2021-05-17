package com;
import java.util.Arrays;
import java.util.Scanner;
public class RadixSorting {
	static int getMax(int arr[] , int n) {
		int max = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
			max = arr[i];
			}
		}
		return max;
		}
	static void countSort(int arr[], int n, int exp)
	{
		int out[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);
		for(i = 0; i < n; i++) 
			count[ (arr[i] / exp) % 10]++;
			for(i = 1; i < 10; i++) 
				count[i] += count[i-1];
				for(i = n - 1; i >= 0; i--) {
					out[count[( arr[i] / exp) % 10] -1] = arr[i];
					count[ (arr[i] / exp) % 10 ]--;
		}
		for(i = 0; i < n; i++) {
			arr[i] = out[i];
		}
	}
	static void radixSort(int arr[], int n) {
		int m = getMax(arr,n);
		for(int exp = 1; m / exp > 0; exp *= 10) {
			countSort(arr, n, exp);
		}
	}
	static void display (int arr[] , int n)
	{
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements into array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("ofter radix sorting");
		radixSort(arr, n);
		display(arr,n);
	}

}







