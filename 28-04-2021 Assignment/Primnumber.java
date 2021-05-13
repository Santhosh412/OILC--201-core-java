package com.app;

public class Primnumber {
	public static  Boolean isPrime(int num)
	{
		boolean b = true;
		for(int i=2; i < num ; i++)
		{
			if(num % i == 0)
			{
					b = false;
					break;
			}
		}
		if (b) 
			return b;
		else
			return b;
	}
		public static void main(String args[])
		{
			int num =Integer.parseInt(args[0]);
			if (num == 0)
			{
				System.out.println("error");
			}
			else
			System.out.println(isPrime(num));
		
	}

}
