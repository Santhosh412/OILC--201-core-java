package com.ass;
import java.util.*;
public class ConvertTime {

	private static String convertTime12Hrs(String time) {
		String res = "";
		if (!time.contains(":")) {
			res = "InValidTime";
		} else {
			String time1[] = time.split("[:]");
			int hours = Integer.parseInt(time1[0]);
			int minutes = Integer.parseInt(time1[1]);
			int seconds = Integer.parseInt(time1[2]);

			if (hours >= 24 || minutes >= 60 || seconds >= 60) {
				res = "InValidTime";
			} else if (hours < 24 && minutes < 60 && seconds < 60) {
				if (hours <= 12) {
					res = hours + ":" + minutes + ":" + seconds;
				} else if (hours > 12) {
					res = (hours - 12) + ":" + minutes + ":" + seconds;

				}
			} else {
				res = "InValidTime";
			}
		}

		return res;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Time in the form of 'hh:mm:ss'");
	String time = sc.nextLine();

	System.out.println(convertTime12Hrs(time));

}
}
