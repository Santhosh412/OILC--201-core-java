package com.methods2;
import java.util.*;
public class NumbersInRange {
	public static String getNumbersInRange(int num1,int num2)
	{
		String res = " ";
		if(num1 < 0 || num2 < 0)
		{
			res += -1;
		}
		else if(num1 == num2) 
		{
		    res  += -2;
		}
		else if(num1 > num2)
		{
			res += -3;
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
	public static void main(String[] arg) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two values ?");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(getNumbersInRange(num1, num2));
	}

}
