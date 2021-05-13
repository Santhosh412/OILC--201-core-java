package com.methods;
import java.util.*;
public class EvenOrOdd {
	public static String isEvenOrOdd(int num)
	{
		String res = " ";
		if( num <= 0)
		{
			res += " Invalid Input ";
		}
		else if(num % 2 == 0)
		{
			res += "even";
		}
		else 
		{
			res += "Odd";
		}
		return res;
	}
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter any number ?");
	        System.out.println(isEvenOrOdd(sc.nextInt()));
	        }
}

