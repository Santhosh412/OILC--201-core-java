package com.ass;
import java.util.*;
public class TypeOfNumber {
	static int sumOfProperDivisors(int number) {
		int result = 0;
		int sum = 0;

		if (number < 0) {

			result = -2;
		} else if (number == 0) {

			result = -3;
		} else {

			for (int i = 1; i < number; i++) {

				if (number % i == 0) {

					sum += i;

				}

			}
			//System.out.println(sum);
			if (sum == number) {

				result = 0;

			} else if (sum < number) {

				result = -1;
			} else {

				result = 1;
			}
		}

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");

		System.out.println(sumOfProperDivisors(sc.nextInt()));

	}


}
