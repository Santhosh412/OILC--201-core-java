package com.array;
import java.util.*;
public class TwoMatrixAddSubMul {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the number row & col ");
	 int mat1[][] = new int[2][2];
	 int mat2[][] = new int[2][2];
	 int res[][]  = new int[2][2];  
	 System.out.println("Enter the elements");
	 
	 for(int i = 0; i < mat1.length; i++)
	 {
		 for(int j = 0; j < mat1.length; j++)
		 {
			 mat1[i][j] = sc.nextInt();
			 
		 }
	 }
	 System.out.println(" Enter the second elements " );
	 for (int i = 0; i < mat2.length; i++)
	 {
		 for(int j = 0; j < mat2.length; j++)
		 {
			 mat2[i][j] = sc.nextInt();
			 System.out.println();
		 }
	 }
		 for(int i = 0; i < mat1.length; i++)
		 {
			for(int j = 0; j < mat2.length; j++)
			{
				res[i][j] = mat1[i][j] + mat2[i][j];
		    }
			System.out.println(" Sum of matrices ");
			
		 }
			for(int i = 0; i < mat1.length; i++)
			{
				for(int j = 0; j < mat2.length; j++)
				{
					System.out.print(res[i][j]+ " ");
				}
				System.out.println();
			}
         
		 
	for(int i = 0; i < mat1.length; i++)
	 {
		for(int j = 0; j < mat2.length; j++)
		{
			res[i][j] = mat1[i][j] - mat2[i][j];
	    }
		System.out.println(" Sub of matrices ");
		
	 }
		for(int i = 0; i < mat1.length; i++)
		{
			for(int j = 0; j < mat2.length; j++)
			{
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i = 0; i < mat1.length; i++)
		 {
			for(int j = 0; j < mat2.length; j++)
			{
				res[i][j] = mat1[i][j] * mat2[i][j];
		    }
			System.out.println(" Multiplication of matrices ");
			
		 }
			for(int i = 0; i < mat1.length; i++)
			{
				for(int j = 0; j < mat2.length; j++)
				{
					System.out.print(res[i][j]+ " ");
				}
				System.out.println();
			}
	}
}


