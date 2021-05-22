package com;
import java.util.*;
public class BucketSorting {
	private static void bucketsort(int[] arr, int bucketSize) {
		List<Integer>[] buckets = new List[bucketSize];
		
		for(int i = 0; i < bucketSize; i++) {
			buckets[i] = new LinkedList();
		}
		for(int num : arr) {
			buckets[hash(num, bucketSize)].add(num);
		}
		int index = 0;
		for(List<Integer>bucket : buckets) {
			for(int num : bucket) {
				arr[index++] = num;
			}
		}
	}
	private static int hash(int num, int bucketSize) {
		return num / bucketSize;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {23,53,45,67, 76,45,1,2,4,5};
	    System.out.println("original array :"+ Arrays.toString(arr));
	    System.out.println("Enter size");
	    bucketsort(arr, sc.nextInt());
	    System.out.println("Sorted array after bucket sort- " + Arrays.toString(arr));
	   
	}

}
