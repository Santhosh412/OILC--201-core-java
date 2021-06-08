package com.ass;
import java.util.*;
public class StringsWithPattern {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println(" Enter No of Words You want to enter:");
		int size=sc.nextInt();
		String words[] = new String[size];
		System.out.println("Enter an Array of Words:");		
		for(int i=0;i<words.length;i++) {
			words[i]=sc.next();
		}		
		for(int i=0;i<words.length;i++) {
			words[i]=words[i].toLowerCase();
		}	
		System.out.println("Enter search Pattern:");
		String pattern=sc.next();
		pattern=pattern.toLowerCase();	
		String result[]=getWordsContainPattern(words,pattern);	
		for(int i=0;i<result.length;i++) {
			if(result[i]!=null) {
			System.out.println(result[i]);
			}
		}
	}
	private static String[] getWordsContainPattern(String[] words, String pattern)
	{
		String res[]=new String[words.length];
		int j=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].contains(pattern)) 
			{
				res[j]=words[i];
				j++;
			}
		}
		return res;
	}

}
