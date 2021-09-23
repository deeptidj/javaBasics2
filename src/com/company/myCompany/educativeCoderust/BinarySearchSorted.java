package com.company.myCompany.educativeCoderust;

public class BinarySearchSorted {
    public static void main(String[] args)  {
        try {
            int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
            int[] inputs = {10, 49, 99, 110, 176};

            for (int i = 0; i < inputs.length; i++) {
                //System.out.println("binSearch(arr, " + inputs[i]+ ") = " +  binSearch(arr, inputs[i]));
                System.out.println("binSearchIterative(arr, " + inputs[i]+ ") = " +  binSearchIterative(arr, inputs[i]));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static int binSearch(int[] a, int key) throws Exception {
        //TODO: Write - Your - Code
        // a = [1,2,3,4,5]
        int res ;
        if (a == null || a.length == 0) return -1;

        res = binSearchAlg(a, 0, a.length - 1, key);
        return res;
    }
    static int binSearchIterative(int[] a, int key) throws Exception {
        int left = 0 ; int right = a.length -1;

        while (left <= right) {
            int mid = (left + right)/2;
            if (a[mid] == key) {
                return mid;
            } else if (key < a[mid]) {
                right = mid - 1 ;
            } else if (key > a[mid]){
                left = mid + 1;
            }
        }

        return -1;
        //throw new IllegalArgumentException("Key not found in the given sorted array");
    }
    static int binSearchAlg(int[] a, int start, int end, int key) throws Exception {
        if (start > end) return -1;

        int mid = (start + end)/2;

        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return binSearchAlg(a, start, mid, key); // a, 3, 5, 6
        } else if (key > a[mid]) {
            return binSearchAlg(a, mid +1, end, key); // a, 3, 5, 6
        }
        return -1;
        //throw new IllegalArgumentException("Key not found in the given sorted array");
    }
    /*
    Given a sorted array of integers, return the index of the given key. Return -1 if the key is not found.
     */

}
