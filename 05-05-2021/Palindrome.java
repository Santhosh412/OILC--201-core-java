package com.methods;
import java.util.*;
public class Palindrome {
public 	 static int isPalindrome(int num) 
     {
		int res = 0;
        int sum=0, rev, temp;
		temp=num;
		if(num <= 0 )
		{
		   res += -1;
		}
			
		 if(num <= 99 || num >= 999 )
	    {
		    res += -2;
	    }
		  while(num > 0)
		   {
			   rev = num % 10;
			   sum = (sum * 10) + rev;
			   num = num/10;
		    }
		  
		    if (temp == sum)
		       {
			     res += 1;
		       }
		         else 
		       {
		          res += 0;
		        }	        
		return res;
	}
		
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ?");
		System.out.println(isPalindrome(sc.nextInt()));
		
	}

}
