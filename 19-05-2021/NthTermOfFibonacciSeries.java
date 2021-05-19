package com.list;
import java.util.*;
public class NthTermOfFibonacciSeries {
	
	public static int getNthTermOfFibonacciSeries(int num) {

		if (num <= 0) {
            return -1;
        }
 
        int previousFib = 0, currentFib = 1;
        for (int i = 0; i < num - 1; i++)
        {
            int newFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = newFib;
        }
 
        return currentFib;
    }
	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth term : ");
		int nthTerm = sc.nextInt();
		System.out.println(getNthTermOfFibonacciSeries(nthTerm));
	}

}
