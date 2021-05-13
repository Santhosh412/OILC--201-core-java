package com.basic;
import java.util.*;
public class StudentMarks {
	public static void main(String args[])
	{
		if(args.length != 5)
		{
			System.out.println("please enter 5 arguments only");
			return;
		}
		int total = 0,avg,sub;
		String grade = " ";
		
		try
		{
			boolean b = true;
			
			for (int i = 0; i < args.length; i++)
			{
			  sub = Integer.parseInt(args[i]);
			  
			  if (sub < 35)
			  {
				  b = false;
				  System.out.println("fail");
				  break;
			  }
			  else
			  {
				  total = total + sub;
			  }
			  if(b)
			  {
				  avg = total / 5;
				  
				  if(total >= 400)
				  {
					  grade = "A grade";
				  }
				  else if (total >= 300 && (total < 400))
				  {
					  grade = "B grade";
				  }
				  else
				  {
					  grade = "C grade";
				  }
				  System.out.println("total :" + total + "Average :" + avg + "Grade :" + grade);
			  }
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("please enter the Integer value2");
			}
		}
	
	
}	


