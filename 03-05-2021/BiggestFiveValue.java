package com.basic;

public class BiggestFiveValue {
	public static void main(String args[])
	{
		int biggest = Integer.parseInt(args[0]);
		int next = Integer.parseInt(args[1]);
		
		if (next > biggest)
		{
			biggest = next ;
		}
		
		next = Integer.parseInt(args[2]);
		if (next > biggest)
		{
			biggest = next;
		}
		
		next = Integer.parseInt(args[3]);
		if (next > biggest)
		{
			biggest = next;
		}
		
		next = Integer.parseInt(args[4]);
		if (next > biggest)
		{
			biggest = next;
		}
		System.out.println("Biggest of 5 Values = " + biggest);
	}

}
