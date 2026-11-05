package com.dsa.java.arrays;

public class Array_comparision {
	public static void main(String[] args) {
		//compare
		int[] arr1= {23,45,78,21};
		int[] arr2= {43,18,67,22};
		
		boolean equal=false;
		
		if(arr1.length==arr2.length) 
		{
			equal=false;
		}
		else 
		{
			
			for(int i=0;i<arr1.length;i++) 
			{
				if(arr1[i]==arr2[i]) 
				 {
					equal=false;
					break;
				 }
			}
		}
			System.out.println(equal);
		
	}
}
