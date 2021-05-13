package com.sample;

public class Pattern4 {
	public static void main(String args[])
	{
		int letter = 65;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print((char)(letter+j) +  " ");
			}
			letter++;
			System.out.println();
		}
	}

}
