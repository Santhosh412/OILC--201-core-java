package com.array;
import java.util.*;
public class AddTwoSingleD{
	public static int[] sum(int[] a, int[] b) 
	{
		int sum[] = new int[5];
		if(a.length == b.length)
		{
			for(int i =0; i < a.length; i++)
			{
				sum[i] = a[i] + b[i];
			}
		}
		return sum;
	}
	
	public static void main (String args[])
	{
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter " + a.length+ "value of info" );
		
		for( int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter" +b.length+ "value of info");
	    for (int i = 0; i < b.length; i++)
	    {
			b[i] = sc.nextInt();
	    }
	    int sum[] = sum(a,b);
	    for(int i : sum)
	    {
	    	System.out.print(i + " ");
	    }
	}

	
}
