package com.assignment;
import java.util.*;
public class StringWeaver {
	public static String getWeavedString(String str1,String str2) {
		String result = " ";
		
		if(str1.length() > str2.length())	{
			result += str1 + str2 + str1;
		}
		else if (str1.length() < str2.length()) {
			result += str2 + str1 + str2;	
		}
		else if(str1.length() == str2.length()) {
			for(int i = 0; i < str1.length(); i++) {
				result += str1.charAt(i) + " " + str2.charAt(i);
			}
	
		}
		return result;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the String1 ");
		String str1 = sc.next();
		System.out.println(" Enter the String2 ");
		String str2 = sc.next();
		
		System.out.println(getWeavedString(str1,str2));
		

	}

}
