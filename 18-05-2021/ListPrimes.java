package com.assignment;
import java.util.*;
public class ListPrimes {
	public static String getPrimeNumbers(int num1,int num2) {
		String res = " ";
		if(num1 < 0 || num2 < 0) {
			res += -1;	
		}
		else if(num1 >= num2) {
			res += -2;
		}
		else {
			for(int i = num1; i < num2; i++) {
				if(isPrime(i)) {
					res += i + " ";
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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(getPrimeNumbers(num1,num2));
		
	}

}
