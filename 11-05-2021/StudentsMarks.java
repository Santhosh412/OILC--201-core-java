package com.array;
import java.util.*;
public class StudentsMarks {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];
		System.out.println("Enter" + marks.length + " values into Array:");

		for (int i = 0; i < marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}

		if (isPass(marks)) {
			System.out.println("Marks:" + (dispMarks(marks)));
			int total = calTotal(marks);
			float avg = total / marks.length;
			System.out.println("Total: " + total + "\nAverage: " + avg);
			System.out.println(findGrade(avg));
		}
		else
		{
			System.out.println("Failed");
		}
	}

	public static String findGrade(float avg) {
		String grade = "";

		if (avg >= 75) {
			grade = "Passed In Distinction \n";
		} 
		else if (avg >= 65) 
		{
			grade = "A grade \n";
		} 
		else if (avg >= 55) 
		{
			grade = "B grade \n";
		} 
		else 
		{
			grade = "c grade \n";
		}
		return grade;
	}

	public static int calTotal(int[] marks) 
	{
		int total = 0;
		for (int i = 0; i < marks.length; i++)
		{
			total += marks[i];
		}
		return total;
	}

	public static String dispMarks(int[] marks) 
	{
		String res = "";
		for (int i = 0; i < marks.length; i++) 
		{
			res += " " + marks[i];
		}
		return res;
	}

	public static boolean isPass(int[] marks) 
	{
		boolean b = false;
		for (int i = 0; i < marks.length; i++) 
		{
			if (marks[i] >= 35) {
				b = true;
			} 
			else
			{
				b = false;
			}
		}
		return b;
	}

}
