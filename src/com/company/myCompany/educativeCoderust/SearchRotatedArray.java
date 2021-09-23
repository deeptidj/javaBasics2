package com.company.myCompany.educativeCoderust;

public class SearchRotatedArray {
    /*
    Search for a given number in a sorted array that has been rotated by some arbitrary number.
     */
    public static void main(String[] args) {
        //Sorted array
        //no dups
        //rotated by some arbitary number
        int[] arr = new int[]{4,5,1,2,3};
      //  int[] arr = new int[]{3,4,5,6,7,8,9,10,11,12,13,14,1,2}; //int descIndex = -1;
        System.out.println(binarySearch(arr,4));

    }
   static int binarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length - 1;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] >= a[left]) {
                //left increasing order
                if (key >= a[left] && key <= a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (key >= a[mid] && key <= a[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}
