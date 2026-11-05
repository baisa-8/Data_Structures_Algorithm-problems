package com.dsa.java.arrays;

public class Array_Majority_of_element {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,1,2,2};
		int majority=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			 }
			if(count>(arr.length/2)) {
				majority=arr[i];
				break;
			}
	}
		System.out.println("majority:"+majority);
	}
}
