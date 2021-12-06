package com.ojas;

public class Ss {

	public static void main(String[] args) {
	
		/*
		 * for(int i =1 ; i<=50;i++) { if(i%2 != 0) { System.out.println(i); } }
		 */

		int arr[] = {2,4,6,8,5,2};
		int a = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>a)
			a=arr[i];
		}
		System.out.println(a);
	}

}
