package com.basic;
import java.util.*;
public class BiggestTwoValue {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int num1,num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2)
		{
			System.out.println("Biggest value :" + num1);
		}
		else
		{
		   System.out.println("Biggest value :" + num2);
		}
	
	}

}
