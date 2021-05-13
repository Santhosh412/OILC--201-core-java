package com.app;

public class Armstrong {
	public static void main(String args[]) {
		int sum = 0, a, temp;
		try {
		int n = Integer.parseInt(args[0]);
		
		if (n > 0 && args[0].length() == 4 )
		{
			temp = n;
			while (n > 0) {
				a = n % 10;
				n = n / 10;
				sum = sum + (a * a * a * a);
			}
			if (temp == sum) 
			{
				System.out.println("armstrong");
			}
			else 
			{
				System.out.println("not armstrong");
			}
		}
		else 
		{
			System.out.println("error");
		}
		}catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}
