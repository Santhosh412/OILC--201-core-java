package com.methods;
import java.util.*;
public class MultipleOf100 {
	public static int getNextMultipleOf100(int num)
	{
		int result = 0;
		if(num >= 10)
		{
			int div = ( num / 100);
			int mul = (div + 1) * 100;
			 result =  mul;
		}
		else if( num < 0)
		{
			return -1;
		}
		else
		{
			return num;
		}
		return result;
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number ");
		System.out.println(getNextMultipleOf100(sc.nextInt()));
	}

}
