package com.methods;
import java.util.*;
public class DigitChecker {
	public static int getDiffOfDigits(int num) 
	{
		int result = 0;
		if(num >= 10 && num <= 99)
		{
			int rem = num % 10;
			int quo = num / 10;
			result = quo - rem;
		}
		else if (num < 0)
		{
			result = -3;
		}
		else if (num > 99)
		{
			result = -2;
		}
		else
		{
			result = -1;
		}
		return result;
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter any Number ? ");
		System.out.println(getDiffOfDigits(sc.nextInt()));
	}

}
