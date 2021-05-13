package com.statments;
import java.util.*;
public class ChekVowCon {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter any charater ?");
		
		char str = sc.next().toUpperCase().charAt(0);
		
		if(Character.isLetter(str))
		{
			boolean b =false;
			
			switch(str)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				
				b = true;
				break;
			}
			String res = " ";
			
			if(b)
			{
				res = str + " is vowel ";
			}
			else
			{
				res = str + " is consonents ";
			}
			System.out.println(res);
			
		}
		else
		{
			System.out.println(" Not a volid characters ");
		}
		
		
	}

}
