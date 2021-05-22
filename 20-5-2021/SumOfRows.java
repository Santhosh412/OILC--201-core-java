package com.list;

import java.util.Scanner;

public class SumOfRows {
	static int m = 3;
    static int n = 3;
  public static void row_sum(int arr[][])
    {
 
        int i, j, sum = 0;
 
        System.out.print("\nFinding Sum of each row:\n\n");
 
        // finding the row sum
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
 
                // Add the element
                sum = sum + arr[i][j];
            }
 
            // Print the row sum
            System.out.println("Sum of the row " + i + " = "
                               + sum);
 
            // Reset the sum
            sum = 0;
        }
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int x = 1;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = x++;
 
        // Get each row sum
        row_sum(arr);
 
    }
}
