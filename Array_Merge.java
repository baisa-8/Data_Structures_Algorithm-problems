package com.dsa.java.arrays;

public class Array_Merge {
	public static void main(String[] args) {
		int[] arr1= {23,45,78,21};
		int[] arr2= {43,18,67,22};
		
		int newArr[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			newArr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			newArr[arr1.length+i]=arr2[i];
		}
		for(int x:newArr) {
			System.out.print(x+" ");
		}
	
	}

}


//copy of array
//reverse
//second largest
//third largest