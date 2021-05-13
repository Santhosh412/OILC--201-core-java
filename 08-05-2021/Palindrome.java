package com.sample;
import java.util.*;
public class Palindrome {
	public 	 static String isPalindrome(int num) 
    {
		String res = " " ;
       int sum=0, rev;
		int temp=num;

	    while(num > 0)
	      {
		   rev = num % 10;
		   sum = (sum * 10) + rev;
		   num = num/10;
	       }
	  
	    if (temp == sum)
	       {
		     res += "Palindrome";
	       }
	         else 
	       {
	          res += "Not a Palindrome";
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
