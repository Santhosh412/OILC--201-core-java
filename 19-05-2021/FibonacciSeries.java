package com.list;
import java.util.*;
public class FibonacciSeries {
	static String getFibonacciSeries(int num) {
		String res  = "";
		int num1 = 0,  num2 = 1, sum = num1 + num2;
		
		if(num == 1) {
			res += num1 + " ";
		}
		else{
			res += num1 + " ";
			res += num2 + " ";
		}
		
		for(int i = 3;i <= num;i++) {
			res += sum + " ";
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
		
		return res;
	}

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
		
		System.out.println("Fibonacci Series Are :" + getFibonacciSeries(sc.nextInt()));
	}
}
