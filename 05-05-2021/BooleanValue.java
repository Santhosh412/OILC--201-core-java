package com.methods;
import java.util.*;
public class BooleanValue {
	public static boolean countBoolean(boolean num1, boolean num2, boolean num3)
	{
		int count = 0;
       
        if(num1) 
		{
			count++;
		}
	      if(num2)
		{
			count++;
		}
		 if(num3)
		{
			count++;
		}
        if(count >= 2)
        {
			return true;
		} 
		else 
		{
		return false;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Boolean values:");
		System.out.println(countBoolean(sc.nextBoolean(),sc.nextBoolean(),sc.nextBoolean()));
	}

}
