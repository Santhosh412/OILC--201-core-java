package com.ass;
import java.util.*;
public class ArrayNearestMinValue {
	
	static int getNearestMinValue(int[] array) {
        
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		return  min - 1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();

		int array[] = new int[size];
		System.out.println("Enter " + size + "Elements ");
		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();
		}

		System.out.println("Nearest minimum Element = " + getNearestMinValue(array));

	}


}
