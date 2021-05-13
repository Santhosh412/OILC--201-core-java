package com.arrays;
import java.util.*;
public class Sample {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 sub marks");
		
		int marks[] = new int[5];
	    for(int i = 0; i < marks.length; i++)
	    {
	    	marks[i] = sc.nextInt();
	    	System.out.println(marks[i]);
	    }
	}

}
