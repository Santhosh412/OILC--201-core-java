package com.list;
import java.util.*;
public class AnagramWord {

    static void isAnagram(String str1, String str2) {  
        
        boolean status = true; 
        
        if (str1.length() != str2.length()) {  
            status = false;  
        }
        else {  
            char[] ArrayS1 = str1.toCharArray();  
            char[] ArrayS2 = str2.toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        
        if (status) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } 
        else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.next();
        System.out.print("Enter second String: ");
        String str2 = sc.next();
        
        isAnagram(str1,str2);
	}

}
