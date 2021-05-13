package com.methods2;

import java.util.Scanner;

public class PrimeNum {
	public static String checkPrimeNum(int num)
	{
	
		String res = " ";
		if(num < 0)
		{
			res += -1;
		}
		else if ( num == 0 || num ==1)
		{
			res += -2;
		}
		else
		{
			boolean b = false;
			int i = 2 , flag = 0;
			while(i < num)
			{
				if (num % i ==0)
				{
					flag++;
					break;
				}
				i++;
			}
			if (flag == 0)
			{
				b = true;
			}
			res = " " + b;
		}
		return res;

	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println(checkPrimeNum(sc.nextInt()));
	}

}
