package com.assignment;
import java.util.*;
public class CollatzSequence {
	public static String getCollatzSequence(int num) {
		String str = " ";
		if(num < 0) {
			str += "error";
		}
		else {
		str = str + " " + num;
		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = (3 * num) + 1;
			}
			str = str + " " + num;
		}
		}
		return str;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
			System.out.println(getCollatzSequence(num));
	
	}

}
