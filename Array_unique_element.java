package com.dsa.java.arrays;

public class Array_unique_element {
	public static void main(String[] args) {
		int [] arr= {4,2,2,1,4};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			 }
			if(count==1) {
				System.out.println("unique element: "+arr[i]);
				break;
			}
		 }
			
	}
	 
}
