package com.methods2;
import java.util.*;
public class CreateStarPattern {
	public static String createStarpattern(int num)
	{
		String res = " ";
		if(num < 0)
		{
			res += -1;
		}
		else if (num == 0)
		{
			res += -2;
		}
		else
		{
			for(int i = 1; i <= num; i++)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number ?");
		System.out.println(createStarpattern(sc.nextInt()));
	}
	
}
