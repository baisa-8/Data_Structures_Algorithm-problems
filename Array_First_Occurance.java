package com.dsa.java.arrays.operations;

public class Array_First_Occurance {
	
	public static int firstOccurance(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int ans=-1;//we don't know index location
		
		//condition
		while(left<=right) {
			//find the mid element
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				ans=mid;//updating index position
				right=mid-1;//going left
				//left=mid+1;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,2,2,2,2,3,4};
		
		int target=2;
		
		int result=firstOccurance(arr, target);
		System.out.println("first Occurance: "+result);
	}
}


