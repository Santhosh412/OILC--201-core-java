package com.ass;
import java.util.*;
public class SumOfModifiedArrayElements {

	static int getSumOfModifiedElements(int[] array) {
		
		int result = 0;
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < array.length; i++) {

			if (array.length == 0 || array.equals(null)) {

				result = -1;
			break;
			}
			else if (array[i] == 0) {
				result = -3;
				break;
			} 
			else if (array[i] < 0) {

				result = -2;
				break;
			
			}
			else {

				if (array[i] % 2 == 0) {

					evenSum += 2 * array[i];

				}
				if (array[i] % 2 != 0) {

					oddSum += array[i] / 2;

				}

				result = evenSum + oddSum;
			}

		}

		return result;

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
		System.out.println(getSumOfModifiedElements(array));
	}


}
