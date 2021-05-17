package com;
import java.util.*; 
public class ThreeDArray{
	public static void main(String args[]) {
		int college[][][] = new int[2][2][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the collage");
		for(int i = 0; i < college.length; i++) {
			for(int j = 0; j < college[i].length; j++) {
				System.out.println(" Enter " + (i + 1) + "brach" +(j + 1) + "studs" + college[i][j].length +"subMarks");
				for(int k = 0; k < college[i][j].length; k++) {
					college[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println(" college Info ");
		for(int i = 0; i < college.length; i++) {
			for(int j = 0; j < college.length; j++) {
				for(int k = 0; k < college[i][j].length; k++) {
					System.out.print(college[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("***********");
		}
	}
	
}

