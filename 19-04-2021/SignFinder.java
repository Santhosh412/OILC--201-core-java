package com.ass19042021;

public class SignFinder {
	
	public static void main(String[] args) {
		try{
			int num =Integer.parseInt(args[0]);
			if(num > 0) {
				System.out.println("Positive Value");
			}
			else if(num < 0) {
				System.out.println("Negative Value");
			}
			else {
				System.out.println("Zero");
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}


}
