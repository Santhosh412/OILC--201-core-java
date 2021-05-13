package com.methods;
import java.util.*;
public class EvenFinder {
	public static int isEven(int num) 
    {
		int res = 0;
	 if( num <= 0)
	 {
		 res += -1;
	 }
	 else if(num % 2 == 0)
	 {
		 res += 1;
	 }
	 
	 else
	 {
		 res += 0;
	 }
	 return res;
}
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number ?");
       System.out.println(isEven(sc.nextInt()));
}
}

