package com.statments;
import java.util.*;
public class StudentMarks {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 sub marks");
		
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		
		String result = " ";
		
		if(m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35)
		{
			result += " your are passed \n ";
			
			int tot = m1 + m2 + m3 + m4 + m5;
			result += " Total marks = " + tot;
			
			int avg = tot / 5;
			result += " Average = " + avg;
			
		
		 if (avg >= 75)
		 {
			result += " you got distinction \n"; 
		 }
		 else if (avg >= 60)
		 {
			 result += " you got first class \n";
		 }
		 else if (avg >= 50)
		 {
			 result += " you got second class \n ";
		 }
		 else
		 {
			 result += " you are failed & plz try again";
		 }
		 System.out.println(result);
	}
		else
		{
			System.out.println(" failed ");
		}

	}
}
