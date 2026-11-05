package com.dsa.java.arrays;

import java.util.Arrays;

public class Array_deletion {
	
		public static void main(String[] args) {
			int[] arr= {20,40,60,10};
			int pos=2;
			
			int[] arr2=new int[arr.length-1];
			
			for(int i=0;i<pos;i++) {
				arr2[i]=arr[i];//0,1,2
				
			}
		
			
			for(int i=pos;i<arr2.length;i++)
			{
				arr2[i]=arr[i+1];
				
			}
			System.out.println("=========new array==========");
			System.out.println(Arrays.toString(arr2));
		}

	}


