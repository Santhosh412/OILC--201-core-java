package com.sample;

public class Pattern3 {
	public static void main(String args[])
	{
		int k =1;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
