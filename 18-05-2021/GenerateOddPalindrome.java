package com.assignment;
import java.util.*;
public class GenerateOddPalindrome {
	public static String getOddPalindromeList(int startNum, int endNum) {
		String res = " ";
		
		if(startNum < 0 || endNum < 0) {
			res += "Error";
		}
		else if(startNum == 100 && endNum == 999) {
			res += "Error";
		}
		else if(startNum > endNum) {
			res += "Error";
		}
		else {
			for(int i = startNum; i <= endNum; i++) {
			if(isPalindrome(i) % 2 != 0) {
				res += i + " ";
			}
		}
		}
		return res;
	}
	static int isPalindrome(int num)
	{
		int rem, temp=num, res=0;
		while(num > 0) {
			rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		if(res == temp) {
			return temp;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Two values :");
		
		System.out.println(getOddPalindromeList(sc.nextInt(),sc.nextInt()));
	

	}

}
