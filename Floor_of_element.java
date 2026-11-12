package com.dsa.java.arrays.operations;

public class Floor_of_element {
	public static int floorofelement(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int ans=-1;
		while(left<=right) {
			//find the mid
			int mid=(left+right)/2;
			
			if (arr[mid] <= target) {
                ans = arr[mid];
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		int target=9;
		int result=floorofelement(arr, target);
		if(result!=-1) {
		
			System.out.println("Floor of a Element: "+result);
		}
		else {
			System.out.println("no floor element found");
		}
	}

}
