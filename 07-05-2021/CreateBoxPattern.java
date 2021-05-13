package com.methods2;
import java.util.*;
public class CreateBoxPattern {
	public static String createBoxPattern(int num1, int num2)
	{
		String res = " ";
		if (num1 < 0 || num2 < 0)
		{
			res += -1;
		}
		else if (num1 == 0 || num2 == 0)
		{
			res += -2;
		}
		else
		{
			for(int i =1; i <= num1; i++)
			{
				for(int j = 1; j <= num2; j++)
				{
					if(i == 1 || i == num1)
					{
						System.out.print("*");
					}
					else if (j == 1 || j == num2)
					{
						System.out.print("*");
					}
					else
					{
                      System.out.print(" ");
					}
					
				}
				System.out.println();
				
			}
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number ? ");
		System.out.println(createBoxPattern(sc.nextInt(),sc.nextInt()));
	}

}
