package com.ojas2;

class DayScholar extends StudentClass{
	double transportFee;

	public DayScholar() {
		this.transportFee = 0;
	}
public DayScholar(int studentId, String name, double examFee, double transportFee) {
	super(studentId, name, examFee);
	this.transportFee = transportFee;
	totalFee = super.examFee + transportFee;
}

public double payFee(double amount) {
	super.totalFee -= amount;
	return totalFee;
}

@Override
public String toString() {
	return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
			+ examFee + " Total Fee: " + totalFee + "]";
}

public String display() {
	return this.toString();
}
}