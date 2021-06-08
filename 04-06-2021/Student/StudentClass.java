package com.ojas2;

public class StudentClass {
	int studentId;
	String name;
	double examFee;
	double totalFee;
	
	StudentClass(){
		this.studentId = 1;
		this.name = null;
		this.examFee = 0;
	}

	public StudentClass(int studentId, String name, double examFee) {
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
	public double payFee(double amount) {
		examFee -= amount;
		return examFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", Exam Fee=" + examFee + "]";
	}
	
	public String display() {
		return this.toString();
	}
	
}

