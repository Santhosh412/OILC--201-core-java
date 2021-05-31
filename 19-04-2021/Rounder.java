package com.ass19042021;

public class Rounder {
	
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if(num < 0) {
				System.out.println(10/0);
			}
			if(num % 2 == 0)
				System.out.println((num / 10+1) * 10);
			else 
				System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
