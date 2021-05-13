package com.methods;
import java.util.*;
public class NaturalNumbers {
	public static String getNaturalNumber(int num1, int num2)
	{
		String res = " ";
		if(num1 < 0 || num2 <0)
		{
			res += -1;
		}
		else if(num1 == 0 || num2 == 0) 
		{
		    res  += -2;
		}
		else
		{
			while(num1 <= num2)
			{
				res += num1 + " ";
				
				num1++;
			}
		}
		
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number ?");
		System.out.println(getNaturalNumber(sc.nextInt(),sc.nextInt()));
		
	}

}
