package com.methods;

import java.util.Scanner;

public class SignFinder {
	public static int findSign(int num)
	{
		if ( num > 0)
		{
			return 1;
		}
		else if ( num < 0)
		{
			return -1;
		}
		else if ( num == 0)
		{
			return 0;
		}
		else
		{
			return num;
		}
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter any number ?");
        System.out.println(findSign(sc.nextInt()));
	}
}
