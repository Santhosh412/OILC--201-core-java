package com.basics;

public class Wish {
	public static void main(String args[])
	{
		if(args[0].equalsIgnoreCase("AM"))
		{
			System.out.println("Good Morning " + args[1]);
		}
		else if(args[0].equalsIgnoreCase("PM"))
		{
			System.out.println("Good Evening" + args[1] );
		}
		else
		{
			System.out.println("first argument should be either AM or PM ");
	}
	}

}
