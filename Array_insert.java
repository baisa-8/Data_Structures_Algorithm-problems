package com.dsa.java.arrays;

import java.util.Arrays;

public class Array_insert {
	public static void main(String[] args) {
		int[] arr= {20,40,60,10};
		int pos=2;
		int value=29;
		int[] arr2=new int[arr.length+1];
		
		for(int i=0;i<pos;i++) {
			arr2[i]=arr[i];//0,1,2
			
		}
		//insert at pos
		arr2[pos]=value;
		
		for(int i=pos;i<arr.length;i++)
		{
			arr2[i+1]=arr[i];
			
		}
		System.out.println("=========new array==========");
		System.out.println(Arrays.toString(arr2));
	}

}
