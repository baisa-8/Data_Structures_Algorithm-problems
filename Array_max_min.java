package com.dsa.java.arrays;

public class Array_max_min {
	public static void main(String[] args) {
		int arr[]= {23,65,10,12,6,19};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		
	}

}
