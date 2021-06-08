package com.ojas2;


public class Hosteller extends StudentClass{
		double hostelFee;
		
		public Hosteller() {
			this.hostelFee = 0;
		}

		public Hosteller(int studentId, String name, double examFee, double hostelFee) {
			super(studentId, name, examFee);
			this.hostelFee = hostelFee;
			totalFee = super.examFee + hostelFee; 
		}
		
		public double payFee(double amount) {
			super.totalFee -= amount;
			return totalFee;
		}

		@Override
		public String toString() {
			return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
					+ examFee + " Total Fee: " + totalFee + "]";
		}

		public String display() {
			return this.toString();
		}
	}
