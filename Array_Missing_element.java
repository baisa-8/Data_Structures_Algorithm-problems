package com.dsa.java.arrays;

public class Array_Missing_element {
	public static void main(String[] args) {
		int arr[]= {0,3,1};
		int n=arr.length;
		int expectedSum=0;
		for(int i=0;i<= n;i++) {
			expectedSum=expectedSum+i;
			
			
		}
		int actualSum=0;
		for(int x:arr) {
			actualSum=actualSum+x;
		}
		int missing_ele=expectedSum-actualSum;
		System.out.println("missing element: "+missing_ele);
	}
}

	