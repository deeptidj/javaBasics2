package com.company.myCompany.InterviewCamp;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = new int[]{0,1,2,2,2,3,4,5};
//        int target = 2;int left = 0; int right = arr.length-1;
//        Arrays.sort(arr);
//        System.out.println(target+" "+binarySearch(arr, left, right, target));
//
//
//        arr = new int[]{10,10,10,20,20,20,30,30,30,45,78};
//        target = 78; left = 0;  right = arr.length-1;
//        Arrays.sort(arr);
//        System.out.println(target+" "+binarySearch(arr, left, right, target));
//
//
//         arr = new int[]{0,0,0,0,0,1,2,3,4,5,6,7,8,9};
//         target = 0; left = 0;  right = arr.length-1;
//        Arrays.sort(arr);
//        System.out.println(target+" "+binarySearch(arr, left, right, target));
//        int[] arr = new int[]{1,2,4,5,6,8};
//        System.out.println(placedWhere(arr,3));

//        int[] arr = new int[]{0,1,2,3,8};
//        System.out.println(placedWhere(arr,6));
        int[] arr;
        arr = new int[]{10,20,30,40,50,60,70};
        int result = findElementClosestToTarget(arr, 29);
        System.out.println(result);
   //     System.out.println(placedWhere(arr,5));
//        System.out.println(placedWhere(arr,15));
      //  System.out.println(placedWhere(arr,25));
      //  System.out.println(placedWhere(arr,35));
//        System.out.println(placedWhere(arr,45));
//        System.out.println(placedWhere(arr,75));

    }
    //Duplicates - find first occurence of the target
    static int firstOccurence(int[] arr , int left, int right, int target) {
        Arrays.sort(arr);
        while (left <= right) {
            int mid = left + (right - left)/2; //{10,20,30,40,40,40,40,50,60,70} 9/2 = 4
            if( arr[mid] > target || arr[mid] == target && mid > 0 && arr[mid -1] == target)  {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
        }}
        return -1;
    }

    static int findElementClosestToTarget(int[] arr, int target) {
        Arrays.sort(arr);
        int bestRes = Integer.MAX_VALUE; int diff = Integer.MAX_VALUE; int currentdiff = 0;
        int left =0; int right = arr.length -1;
        while (left <= right) {
            int mid = left + (right - left)/2;

            //find the diff between the target and the current mid element in the array.
            currentdiff = Math.abs(arr[mid] - target);
            if (currentdiff < diff) {
                bestRes =  arr[mid];
                diff = currentdiff;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }

        }
        return bestRes;
    }

    static int placedWhere1(int[] arr, int target) {

        return -1;
    }

    static int binarySearchOld(int[] arr, int left, int right, int target) {
        int found = -1;
        while(left <= right) {
            int mid = (left + right)/2;
            if (arr[mid] == target) {
                found = mid;
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid +1;
               // binarySearch(arr, mid+1, right, target);
            } else if (target < arr[mid]) {
                //binarySearch(arr, left, mid -1, target);
                right = mid - 1;
            }
        }
        return found;
    }
    /*
    You are given a sorted array A and a target T. Return the index where T would be placed if inserted in order. For example,

        A = [1,2,4,5,6,8] and T = 3, return index 2 length = 5;
        A = [1,2,4,5,6,8] and T = 0, return index 0
        A = [1,2,4,5,6,8] and T = 4, return index 3.
        [10,20,30,40,50,60] and t = 35
         0  1  2  3  4  5  = 5/2 = mid = 2
        1,2,4,5,8; t = 6; mid = 3 => 5;
     */
    static int placedWhere(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right && left >= 0 && right >= 0) {
            int mid = left + (right - left) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
                if (target < arr[left])  return (mid+1);
            } else{
                right = mid -1;
                if (target < arr[right]) return (mid -1);
            }
        }
        return -1;
    }
}
