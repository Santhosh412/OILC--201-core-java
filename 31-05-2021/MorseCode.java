package com.ass;
import java.util.*;
public class MorseCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String str = sc.next();

		System.out.println(getMorseCode(str));
	}

	private static String getMorseCode(String str) {
		String res = "";
		char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		if (str.isEmpty()) {
			res = "Null String";
		} else if (str.length() == 0) {
			res = "EmptyString";
		} else {
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < letter.length; j++) {
					if (str.charAt(i) == letter[j]) {
						res += code[j] + " ";
						break;
					}
					else {
						res="Invalid Character";
					}
				}
			}
		}
		return res;

	}


}
