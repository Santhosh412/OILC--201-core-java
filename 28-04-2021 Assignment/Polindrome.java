package com.app;

public class Polindrome {
	public static boolean isPolindrom(int num)
	{
	
		int sum=0, rev, temp;
		
		temp=num;
		while(num>0)
		{
			rev = num % 10;
			sum = (sum * 10) + rev;
			num = num/10;
		}
		if(temp == sum)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		int num=Integer.parseInt(args[0]);
		System.out.println(isPolindrom(num));
		
	}

}
