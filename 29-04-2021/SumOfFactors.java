package com.basic;

public class SumOfFactors {
	public static void main(String args[])
	{
		try
		{
			int i, sum = 0;
			int num = Integer.parseInt(args[0]);
			
			
           if (num > 0)
           {
        	   for (i = 1; i <= num; i++)
        	   {
        		   if (num % i == 0)
        		   {
        			   sum = sum + i;
        		   }
        			   System.out.println(sum);
        		   }
        	   }
           
           
		}
	
		catch(Exception e)
		{
			System.out.println("error");
		}
	}


}


