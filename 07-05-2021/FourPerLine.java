package com.methods2;
import java.util.*;
public class FourPerLine {
	public static String getFourPerLine(int num)
	{
		String res = " ";
		if (num < 0)
		{
			res += -1;
		}
		else if (num == 0)
		{
			res += -2;
		}
		else if (num > 99)
		{
			res += -3;
		}
		else 
		{
			int i =1;
			while (i <= num)
			{
				res += i + " ";
				if(i % 4 == 0)
				{
					res += "\n";
				}
				i++;
			}
		}
		return res;
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any values");
		int num = sc.nextInt();
		System.out.println(getFourPerLine(num));
	}

}
