package com.list;
import java.util.*;
public class DisplayTheConsonents {
	
    public static void getConsonents(String str){
	
		for(int i=0; i<str.length(); i++) {
	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
	         {
	          
	         }else {
	 			char[] chararray =str.toCharArray();
				System.out.print(chararray[i] + " ");
			}

	      }
	}
	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter the String");
	      
	      String str = sc.next();
	      getConsonents(str);
	      
	}

}

