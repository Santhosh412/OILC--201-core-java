package com.app;

public class Factorial {
	public static void main(String args[])
	{
		int i,fact = 1;
		try {
		int num = Integer.parseInt(args[0]);
		if(num > 0) {
		for(i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of" + num + "is" + fact);

	 }else {
		System.out.println("error");
	 }
	 }catch(Exception e)
		{
			System.out.println("error");
		}
		
}
}
