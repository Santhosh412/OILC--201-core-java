package com.statments;
import java.util.*;
public class MenuDrive {
	public static void main (String args[])
	{
		Scanner sc  = new Scanner(System.in);
		while(true)
		{
			String menu = " Menu Drive Application \n ";
			menu += " 1.Addition \n ";
			menu += " 2.Subtraction \n ";
			menu += " 3.Multiplication \n ";
			menu += " 4.Divion \n ";
			menu += " 5.Exit \n ";
			menu += " Select any option ? \n";
			System.out.println(menu);
			
			int choice = sc.nextInt();
			String res = " ";
			
			switch(choice)
			{
			case 1 :
				System.out.println(" Enter two number ? ");
				res = " sum = " + (sc.nextInt() + sc.nextInt());
				break;
			case 2 :
				System.out.println(" Enter two number ? ");
				res = " sub = " + (sc.nextInt() - sc.nextInt());
				break;
			case 3 :
					System.out.println(" Enter two number ? ");
					res = " product = " + (sc.nextInt() * sc.nextInt());
					break;
			case 4 :
				System.out.println(" Enter two number ? ");
				res = " Division = " + (sc.nextInt() / sc.nextInt());
				break;
			case 5 :
				System.exit(0);
				break;
				
				default:
					res = " Invoild Options";
			}
			System.out.println(res);
		}
		
	}

}
