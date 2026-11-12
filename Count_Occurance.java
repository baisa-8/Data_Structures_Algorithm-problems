package com.dsa.java.arrays.operations;


public class Count_Occurance {

    public static int firstOccurance(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1; // Search left
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int LastOccurance(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1; // Search right
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int CountOccurance(int arr[], int target) {
        int first = firstOccurance(arr, target);
        int last = LastOccurance(arr, target);

        if (first == -1) {
            return 0;
        }

        int count = last - first + 1;

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 2, 2, 3, 4};

        int target = 2;

        int result = CountOccurance(arr, target);

        System.out.println(result);
    }
}










//public class Count_Ocurrance {
//	public static int firstOccurance(int arr[],int target) {
//		int left=0;
//		int right=arr.length-1;
//		int ans=-1;//we don't know index location
//		
//		//condition
//		while(left<=right) {
//			//find the mid element
//			int mid=(left+right)/2;
//			if(arr[mid]==target) {
//				ans=mid;//updating index position
//				//right=mid-1;//going left
//				left=mid+1;
//			}
//			else if(arr[mid]<target) {
//				left=mid+1;
//			}
//			else {
//				right=mid-1;
//			}
//		}
//		return ans;
//	}
//	public static int LastOccurance(int arr[],int target) {
//		int left=0;
//		int right=arr.length-1;
//		int ans=-1;//we don't know index location
//		
//		//condition
//		while(left<=right) {
//			//find the mid element
//			int mid=(left+right)/2;
//			if(arr[mid]==target) {
//				ans=mid;//updating index position
//				//right=mid-1;//going left
//				left=mid+1;
//			}
//			else if(arr[mid]<target) {
//				left=mid+1;
//			}
//			else {
//				right=mid-1;
//			}
//		}
//		return ans;
//	}
//	public static int CountOccurance(int arr[],int target) {
//		int first=firstOccurance(arr, target);
//		int last=LastOccurance(arr, target);
//		int count=last-first;
//		return count;
//		
//		
//	}
//	public static void main(String[] args) {
//		int arr[]= {1,2,2,2,2,2,2,2,2,3,4};
//		int target=2;
//		int result=CountOccurance(arr, target);
//		System.out.println(result);
//	}
//}
//
//
//
//
