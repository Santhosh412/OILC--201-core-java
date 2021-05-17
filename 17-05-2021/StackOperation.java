package com;
import java.util.*;
public class StackOperation {
	static int stack[] = new int[5];
	static int top = -1;
	static void menu() {
		String m = "stack operations \n";
		       m += "1.push \n";
		       m += "2.Delete \n";
		       m += "3.Display \n";
		       m += "4.quit \n";
		       m += "select any option \n";
		       System.out.println(m);
	}
	static void push(int ele) {
		if(isFull()) {
			System.out.println("stack is overflow");
		}else {
			stack[++top] = ele;
			System.out.println("Elements is added");
		}
	}
	static void pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
			System.out.println("Deleted Elements is " + stack[top]);
			top--;
		}
	}
	static boolean isEmpty() {
		boolean b = false;
		if(top == -1) {
			b = true;
		}
		return b;
	}
	static boolean isFull(){
		boolean b = false;
		if(top == stack.length) {
			b = true;
		}
		return b;
	}
	static void display() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
			System.out.println("stack Elements as follows");
			for(int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	static void accept() {
		System.out.println("Enter elements to push ?");
	}
	public static void main(String args) {
		Scanner sc = new Scanner (System.in);
		for(;;) {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				accept();
				push (sc.nextInt());
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
				break;
				default:
					System.out.println("Invalid option");
			
			}
			
		}
		
	}

}
