package com.basic;

public class SwapNumWithTemp {
	 

	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int temp;
	    System.out.println("BeforeSwaping :" + num1 + num2);
	    
	    temp = num1;
	    num1 = num2;
	    num2 = temp;
	    System.out.println("AfterSwaping :" + num1 + num2);
	}

}
