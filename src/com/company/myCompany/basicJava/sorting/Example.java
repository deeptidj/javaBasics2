package com.company.myCompany.basicJava.sorting;

public class Example {
    public static void main(String[] args) {
        int[] arr = {5,1,2,8,9};
        sort(arr);
        print(arr);
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while(j>0 && arr[j-1] > arr[j]) {
                int t = arr[j-1];
                arr[j-1]= arr[j];
                arr[j] = t;
            }
        }
    }
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
