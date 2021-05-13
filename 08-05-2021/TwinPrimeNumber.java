package com.sample;
import java.util.*;
public class TwinPrimeNumber {
	public static boolean isPrime(int num)
	{
	
		boolean b = false;
		int i =2,flag =0;
		while (num>i)
		{
			if(num % i ==0)
			{
				flag++;
				break;
			}
			i++;
		}
		if(flag == 0)
		{
			b = true;
		}
		return b;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number ? ");
	    int min = sc.nextInt();
	    int max = sc.nextInt();
	    for(int range = min; range < max; range++)
	    {
	    	if(isPrime(range) && isPrime(range + 2))
	    	{
	    		System.out.println(range + "," + (range + 2));
	    	}
	    }
	}

}
