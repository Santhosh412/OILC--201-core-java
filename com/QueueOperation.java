package com;
import java.util.*;
public class QueueOperation {
	static int queue[] = new int[5];
	static int rear = 0;
	static int front = 0;
	
	static void menu() {
		String m = "Queue operation \n";
		       m += "1.insert \n";
		       m += "2.delete \n";
		       m += "3.display \n";
		       m += "4.exit \n";
		       m += "Select any option ?";
		       System.out.println(m);
	}
	
	static boolean isEmpty() {
		
		boolean b = false;
		if(rear == front)
		{
			b =true;
		}
		return b;
	}
	static boolean isFull() {
		boolean b=false;
		if(rear == queue.length) {
			b = true;
		}
	return b;
}
  static void insert(int ele) {
	  if(isFull())
	  {
		  System.out.println("Queue is full");
	  }else {
		  queue[rear++] =ele;
		  System.out.println("inserter");
	  }
  }
  static void delete() {
	  if(isEmpty()) {
		  System.out.println("queue is empty");
	  }else {
		  System.out.println("Deleted elements is =" + queue[front]);
		  for(int i = front; i < rear - 1; i++)
		  {
			queue[i] = queue[i +1];  
		  }
			rear--;
	  }
  }
	  static void display() {
		  if(isEmpty()){
		  System.out.println("queue is empty");
		  }else 
		  {  
			  System.out.println("queue elements are as folloes");
		  }
			  for(int i = front; i < rear; i++) {
				  System.out.println(queue[i]);
			  }
			  }
			  static void accept() {
				  System.out.println("Enter element to isert");
			  }
			  public static void main(String[] args)
			  {
				  Scanner sc =new Scanner(System.in);
				  for(;;) {
					  menu();
					  int choice = sc.nextInt();
					  switch(choice)
					  {
					  case 1:
						  accept();
					  insert(sc.nextInt());
					  break;
					  case 2:
						  delete();
						  break;
					  case 3:
						  display();
						  break;
					  case 4:
						  System.exit(0);
						  break;
						  default:
							  System.out.println("invalid option");
				  }
			  }
		  }
			  
}
