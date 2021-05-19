package com.assignment;
import java.util.*;
public class TwinPrimes {
	public static String getTwinPrimes(int num1, int num2) {
		String res = " ";
		if(num1 < 0 || num2 < 0) {
			res += "Error";
		}
		else if(num2 > 100) {
			res += "Error";
		}
		else if(num1 >= num2)
		{
			res += "Error";
		}
		else {
		 for(int range = num1; range < num2; range++)
		    {
		    	if(isPrime(range) && isPrime(range + 2))
		    	{
		    		System.out.println(range + "," + (range + 2));
		    	}
		    }
		}
		return res;
	}
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number ? ");
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	   System.out.println(getTwinPrimes(num1,num2));
	}
	}
