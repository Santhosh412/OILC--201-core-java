package com;
import java.util.*;
public class LinearSearching {
	public static void main(String args[]) {
		
		int i, n, search;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elemens");
		n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("enter those" + n +"elements");
		for(i = 0; i< n; i++)
		{
			array[i] = sc.nextInt();
		}
			System.out.println("Enter value to find");
			search = sc.nextInt();
			
			for(i = 0; i < n; i++) {
				if(array[i] == search) {
					System.out.println(search + "is present at location"+ (i+1) + " .");
					break;
				}
			}
			if(i == n) {
				System.out.println(search +"isn't present in array");
			}
		}
	}


