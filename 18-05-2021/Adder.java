package com.assignment;
import java.util.*;
public class Adder {
	public static String getSum(int num1, int num2) {
		String res = " ";
		if(num1 <= 0 || num2 <= 0) {
			res += "Error";
		}
		else {
			int sum = 0;
			sum = num1 + num2;
			res += sum + " ";
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(getSum(num1, num2));

	}

}
