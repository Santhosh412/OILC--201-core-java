package com.statments;
import java.util.*;
public class EvenOddUsingSwitch {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any value ");
		
		int num = sc.nextInt();
		String res = " ";
		
		switch (num % 2)
		{
		case 0:
			res = num + " is even number ";
			break;
			
		case 1:
			res = num + " is Odd number ";
			break;
		}
		System.out.println(res);
	}

}
