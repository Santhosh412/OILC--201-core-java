package com.methods2;

import java.util.Scanner;

public class RangeWithStep {
	public static String getNumbersInRange(int num1, int num2, int step)
	{
		String res = " ";
		
		if (num1 < 0 || num2 < 0)
		{
			res += -1;
		}
		else if (num1 == num2)
		{
			res += -2;
		}
		else if (num1 > num2)
		{
			res += -3;
		}
		else
		{
			while (num1 < num2)
			{
				res += num1 + " ";
	
				num1 += step;
			}
		}
		return res;
	}
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter three values");
       
       System.out.println(getNumbersInRange(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}

}
