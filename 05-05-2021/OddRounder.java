package com.methods;
import java.util.*;
public class OddRounder {
	public static int oddRounder(int num) 
	{
		if ( num < 0)
		{
			return -1;
		}
		else if (num == 0)
		{
			return -2;
		}
		else if (num % 2 == 0)
		{
			return num;
		}
		else
		{
			int div = num / 10 ;
			int mul = (div + 1) * 10;
			return mul;
		}
		
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter any number ?");
        System.out.println(oddRounder(sc.nextInt()));
    }

}
