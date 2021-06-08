package com.ass;
import java.util.*;
public class KaprekarNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number:");
		int num = sc.nextInt();

		System.out.println(iskaprekar(num));
	}

	static String iskaprekar(int n) {

		String res = "False";
		if (n < 0) {
			res = "" + -1;
		} else if (n == 0) {
			res = "" + -2;
		} else {
			int sq_n = n * n;
			int temp = sq_n;
			int count_digits = 0;
			while (temp != 0) {
				count_digits++;
				temp /= 10;
			}
			for (int i = 1; i < count_digits; i++) {
				int eq_parts = (int) Math.pow(10, i);
				int sum = sq_n / eq_parts + sq_n % eq_parts;
				if (sum == n)
					res = "True";
			}
		}
		return res;
	}

}

