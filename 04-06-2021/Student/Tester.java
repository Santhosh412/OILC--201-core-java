package com.ojas2;
import java.util.*;
public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentId, name, examfee, transportfee");
		DayScholar ds = new DayScholar(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
		ds.payFee(1000);
		System.out.println(ds);
	}


}
