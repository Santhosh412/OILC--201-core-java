package com.methods2;
import java.util.*;
public class ReverseOrder {
	 public static String getNumbersInRange(int start_val, int end_val) 
	 {
		 String res = " ";
		 if (start_val < 0 || end_val < 0)
		 {
			 res += -1;
		 }
		 else if (start_val == end_val)
		 {
			res += -2; 
		 }
		 else if (start_val < end_val)
		 {
			 res += -3;
		 }
		 else if (start_val - end_val == 1)
		 {
			 res += -4;
		 }
		 else
		 {
			 while (start_val > end_val)
			 {
				 res += start_val + " ";
				 start_val--;
			 }
		 }
		 return res;
	 }
	 public static void main(String[] arg) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two values ?");
			int start_val= sc.nextInt();
			int end_val = sc.nextInt();
			System.out.println(getNumbersInRange(start_val, end_val));
		}


}
