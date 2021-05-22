package com.list;
import java.util.*;
public class SumOfColums {
	static int m = 3;
	static int n = 3;
	   static void column_sum(int arr[][])
	    {
	 
	        int i, j, sum = 0;
	 
	        System.out.print(  "\nFinding Sum of each column:\n\n");
	 
	        // finding the column sum
	        for (i = 0; i < m; i++) {
	            for (j = 0; j < n; j++) {
	 
	                // Add the element
	                sum = sum + arr[j][i];
	            }
	 
	            // Print the column sum
	            System.out.println("Sum of the column " + i
	                               + " = " + sum);
	 
	            // Reset the sum
	            sum = 0;
	        }
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
        int[][] arr = new int[m][n];
 
        // Get the matrix elements
        int x = 1;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = x++;
 
        // Get each column sum
        column_sum(arr);
 

	}

}
