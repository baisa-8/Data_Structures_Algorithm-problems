package com.dsa.java.arrays.operations;

public class Lower_Bound {
	public static int lowerbound(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int ans=-1;
		while(left<=right) {
			//find the mid
			int mid=(left+right)/2;
			
			if(arr[mid]>=target) {
				ans=mid;
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,6};
		int target=2;
		int result=lowerbound(arr, target);
		System.out.println("Insert Position: "+result);
	}
}
