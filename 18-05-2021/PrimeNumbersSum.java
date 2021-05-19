package com.assignment;
import java.util.*;
public class PrimeNumbersSum {
	public static int getPrimeNumbersSum(int num1,int num2) {
		int res = 0;
		if(num1 < 0 || num2 < 0) {
			res += -1;	
		}
		else if (num1 == 0 || num2 == 0) {
			res += -2;	
		}
		else if(num1 >= num2) {
			res += -3;
		}
		else {
			for(int i = num1; i < num2; i++) {
				if(isPrime(i)) {
					res += i;
				}
			}
		}
		return res;	
	}
	static boolean isPrime(int num) {
		boolean b = false;
		int flag = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				flag++;
				break;
			}
			if(flag == 0) {
				b = true;
			}	
		}
		return b;
		
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(getPrimeNumbersSum(num1,num2));
		

	}

}
