package com.assignment;
import java.util.*;
public class SumOfArray {
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		if(arr[sum] == 0) {
			sum += 1;
		}
		else if(arr[sum] < 0) {
			sum += -2;
		}
		else {  
             for ( int i = 0; i < arr.length; i++) {  
              sum = sum + arr[i];  
      }
   }
		return sum;
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
		System.out.println(sumOfArray(arr));
	}
}