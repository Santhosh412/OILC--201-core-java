package com.ojas.clients;

interface ArithOper {

	void sum(int a, int b);
}

interface SubOper extends ArithOper {
	void sub(int a, int b);

}

public class InterfaceDemoOperations implements SubOper {

	public static void main(String[] args) {
		InterfaceDemoOperations obj = new InterfaceDemoOperations();
		obj.sum(10, 20);
		obj.sum(20, 60);
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("SUb = " + (a - b));

	}

	@Override
	public void sum(int a, int b) {
		System.out.println("Sum = " + (a + b));

	}
}