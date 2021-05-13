package com.statments;
import java.util.*;
public class Months {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Month Name With 3 Letters ?");
		
		String monthName = sc.next().toUpperCase();
		String result =  " ";
		
		switch (monthName)
		{
		case "JAN":
		case "MAR":
		case "MAY":
		case "JUL":
		case "AUG":
		case "OCT":
		case "DEC":
			result = monthName + " has a 31 days only";
			break;
			
		case "APR":
		case "JUN":
		case "SEP":
		case "NOV":
			result = monthName + " has a 30 days onlys";
			break;
			
		case "FEB":
			result = monthName + "has a 28 days onlys";
			break;
			
			default:
				result="invalid";
				break;
				
		}
		System.out.println(result);
	}

}
