package com.dsa.java.arrays;

public class Array_sum {
	public static void main(String[] args) {
		int arr[]= {33,54,23,12,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("sum: "+sum);
		double avg=sum/arr.length;

		System.out.println("avg: "+avg);
	}
}
