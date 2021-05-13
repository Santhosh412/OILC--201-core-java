package com.methods2;
import java.util.*;
public class CheckPalindrome {
	public static String checkPalindrome(int num)
	{
		String res = " ";
		if (num < 0)
		{
			res += -1;
		}
		else if (num < 10)
		{
			res += -2;
		}
		else 
		{
			boolean b = true;
			int rev,sum = 0,flag;
			flag = num;
			while(num > 0)
			{
				rev = num % 10;
				sum = (sum * 10) + rev;
				num = num / 10;
			}
			if (flag == sum)
			{
			   res += true;
			}
			else
			{
				res += false;
			}
		}
		return res;
	}

	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number ?");
		System.out.println(checkPalindrome(sc.nextInt()));
	    
	}
}
