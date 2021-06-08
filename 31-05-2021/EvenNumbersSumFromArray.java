package com.ass;
import java.util.*;
public class EvenNumbersSumFromArray {
	static int getSumOfEvenNumbers(int[] array) {
		
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			if (array.length == 0 || array.equals(null)) {

				sum = -3;
			}

			else if (array[i] == 0) {
				sum = -2;
			}
			else if (array[i] < 0) {
				sum = -1;
			}
			else {
				if (array[i] % 2 == 0) {

					sum += array[i];

				}

				sum = sum;

			}

		}

		return sum;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();

		int array[] = new int[size];
		System.out.println("Enter " + size + " Elements ");
		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();
		}

		System.out.println(getSumOfEvenNumbers(array));
	}


}
