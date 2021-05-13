package com.methods;
import java.util.*;
public class LeastNumber {
	public static int getLeastNum(int num1, int num2)
	{
		int res = 0;
		if(num1 < 0 || num2 < 0)
		 {
			 res += -1;
		 }
		 else if(num1 == 0 || num2 == 0)
		 {
			 res += -2;
		 }
		 else if (num1 < num2)
		 {
			 res += num1;
		 }
		 return num2;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any numver ?");
        System.out.println(getLeastNum(sc.nextInt(),sc.nextInt()));
	}
}
