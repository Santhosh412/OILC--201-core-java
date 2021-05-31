package com.ass19042021;

public class Sum {
	public static void main(String[] args) {
		try {
			int[] num = new int[args.length];
			int x = 0;
			for(int i = 0; i < num.length; i++) {
				num[i]=Integer.parseInt(args[i]);
				if(num[i] < 0)
					System.out.println(10/0);
				if(num[i] != 0)
					num[i] = (num[i]/10+1)*10;
			}
			for(int i=0; i < num.length; i++) {
				x = x+num[i];
			}
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
