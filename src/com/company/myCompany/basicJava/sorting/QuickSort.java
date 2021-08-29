package com.company.myCompany.basicJava.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] n = {1,5,2,4,3};
         quickSort(n, 0, n.length-1);
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

        public static int partition1(int[] n, int low, int hi){
            int pivot = n[hi];
            int tmp;
            int i = low - 1; //
            for (int j = low; j < hi; j++) {
                if (n[j] < pivot){ // if current element is smaller than the pivot element.
                    i++;  //increment the index of the smaller element.
                    tmp = n[j]; //Swap n[i] and swap n[j]
                    n[j] = n[i];
                    n[i] = tmp;
                }
            }
            tmp = n[i+1];
            n[i+1] = n[hi];
            n[hi] = tmp;
            return i+1;
        }
        static void quickSort(int[] n, int low, int hi) {
            if (low < hi) {
                int partition = partition1(n, low, hi);
                quickSort(n, low, partition - 1);
                quickSort(n, partition + 1, hi);
            }
        }

}
