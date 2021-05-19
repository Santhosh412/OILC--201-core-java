package com.list;
import java.util.*;
public class StringPolindrome {
	static String isPalindrame(String string) {
		String str = "";
		String res = "";
		
		for (int i = string.length() - 1; i >= 0; i--) {
			res += string.charAt(i);
		}
		if(res.equals(string))
		{
			str = string + " is Palindrome";
		}
		else {
			str = string + " not a palindrome";
		}
		
		return str;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		
       System.out.println(isPalindrame(name));
	}
	
	
	
	
	
}