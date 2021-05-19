package com.assignment;
import java.util.*;
public class FizzBizz {

	public static String getFizzBizz(int num) {
		String res = " ";
		if(num % 3 == 0 && num % 5 == 0)
		{
		  res += "FizzBizz";	
		}
		else if(num % 5 == 0)
		{
			res += "Bizz";
		}else if (num % 3 == 0)
		{
			res += "Fizz";
		}
		else {
			res += num + " ";
		}
		return res;
	}

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			if(num > 0)
			{
				System.out.println(getFizzBizz(num));
			}
			else
			{
				System.out.println("error");
			}
		}

	}

