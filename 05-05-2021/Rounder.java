package com.methods;
import java.util.*;
public class Rounder {
	 public static int calculate(int num) 
	 {
		if (num <= 0)
		{
			return -1;
		}
		else if (num % 2 == 0)
		{
			return (num * num);
			
		}
		else
		{
			return (num * num * num);
		}
	 }
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter any number ?");
	        System.out.println(calculate(sc.nextInt()));
	 }
}
