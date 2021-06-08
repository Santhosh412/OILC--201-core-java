package com.ass;
import java.util.*;
public class ValidateTime {

	static boolean isValidTime(String time) {

		boolean result = true;

		String[] split = time.split(":");

		int hours = Integer.parseInt(split[0]);
		int minutes = Integer.parseInt(split[1]);
		int seconds = Integer.parseInt(split[2]);

		if ((hours < 0 || hours > 24) || (minutes < 0 || minutes > 60) || (seconds < 0 || seconds > 60)) {

			result = false;
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Time ");
		System.out.println(isValidTime(sc.next()));
	}

}
