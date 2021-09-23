package com.company.myCompany.educativeCoderust;

public class SmallestCommonNumber {
    public static void main(String[] args) {
            int[] arr1 = new int[]{6,7,10,25,30,63,64};
            int[] arr2 = new int[]{0,4,5,6,7,8,50};
            int[] arr3 = new int[]{1,2,10,14};

        System.out.println(findSmallestCommonNumber(arr1,arr2,arr3));
    }
    /*
    Given three integer arrays sorted in ascending order,
    return the smallest number that is common in all three arrays.
    arr1 = {6,7,10,25,30,63,64}
    arr2 = {0,4,5,6,7,8,50}
    arr3 = {1,6,10,14}
    positive, ascending sorted
     */
    static int findSmallestCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
        int a1 =0,a2 =0,a3 = 0;
        while(a1 < arr1.length && a2 < arr2.length && a3 < arr3.length) {
            if (arr1[a1] == arr2[a2] && arr2[a2] == arr3[a3]) {
                return arr1[a1];
            }

            if (arr1[a1] <= arr2[a2] && arr1[a1] <= arr3[a3]) {
                a1++;
            }
            else if (arr2[a2] <= arr1[a1] && arr2[a2] <= arr3[a3]) {
                a2++;
            }
            else if (arr3[a3] <= arr2[a2] && arr3[a3] <= arr1[a1]) {
                a3++;
            }
        }
        return -1;
    }
}
