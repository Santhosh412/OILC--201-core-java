package com.ojas.clients;

import java.util.Scanner;

class Student{
	int studNo;
	String sname;
	Student(int studNo, String sname){
		this.studNo = studNo;
		this.sname = sname;
		System.out.println("Parameterised constructor");
		
	}
	public void dispStudentDetails() {
		 System.out.println("No :" + studNo);
		 System.out.println("Name :" + sname);
	 }
}
class Employee extends Student{
	double salary;
	double bonus;
	public Employee(int studNo,String sname, double salary,double bonus) {
		super(studNo,sname);
		this.bonus = bonus;
		this.sname = sname;
		
	}
	public void dispStudentDetails() {
		super.dispStudentDetails();
		System.out.println("Total salary" + (salary + bonus));
	}
}

public class Client {

		public static void main(String args []) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your no, sname, salary,bonus?");
			Student st = new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble());
	        st.dispStudentDetails();
		}
	}

