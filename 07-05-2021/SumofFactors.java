package com.sample;
import java.util.*;
public class SumofFactors {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ?");
		int num = sc.nextInt();
		int i,sum = 0;
		for(i = 1; i <= num; i++)
		{ 
			if(num % i == 0)
			{
			sum = sum + i;
		  }
			System.out.println(sum);
	}

}
}