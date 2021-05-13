package com.methods;
import java.util.*;
public class SumOfMul10 {
	public static int sumOfMultiples(int num1, int num2, int num3)
	{
		int sum = 0;
		if(num1 <= 0 || num2 <= 0 || num3 <= 0)
		{
			sum += -1;
		}
	 else 
	 {
		sum = round(num1) + round(num2) + round(num3);
	 }
	return sum;
}

public static int round(int num) {
	int div = num / 10;
	int mul = (div + 1) * 10;
	return mul;
}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ?");
        System.out.println(sumOfMultiples(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }

}
