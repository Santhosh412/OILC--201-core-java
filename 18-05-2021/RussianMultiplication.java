package com.assignment;
import java.util.*;
public class RussianMultiplication {
	public static int getProduct(int num1, int num2) {
		int product = 0;
		if (num1 > 0 && num2 > 0) {
			if (num1 % 2 != 0) {
				product = product + num2;
			}
			while (num1 != 1) {
				num1 = num1 / 2;
				num2 = num2 * 2;
				if (num1 % 2 != 0) {
					product = product + num2;
				}
			}
			return  product;
		}
		else 
		{
			return  -1;
		}
	}
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number");
		int num1 = s.nextInt();
		System.out.println("Enter second number");
		int num2 = s.nextInt();

		System.out.println(getProduct(num1, num2));
	}
   

	}