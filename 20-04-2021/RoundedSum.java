package com.ass2;

public class RoundedSum {
	static int sum = 0;
	static String roundedSum(int num) {
			if(num != 0) {
				int r = num % 10;
				if(r >= 5) {
					num=(num / 10+1) * 10;
				}
				else if((r < 5) && (r > 0)) {
					num = (num / 10) * 10;
				}
			}
			return "" + (sum + num);
		}
	public static void main(String[] args) {
		int[] a = new int[args.length];
		try {
			for(int i =0; i < a.length; i++) {
				a[i]=Integer.parseInt(args[i]);
				if(a[i] < 0)
					System.out.println(10/0);
				sum = Integer.parseInt(roundedSum(a[i]));
			}
			System.out.println(sum);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
