package com.company.myCompany.basicJava.ArrayListExamples;

import java.util.Arrays;
import java.util.List;

public class ArrayExamples {
    public static void main(String[] args) {
        final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
        //int[] arr = new int[MAX_ARRAY_LENGTH-2000000000];
        int[] newArr = new int[100000];
        System.out.println(newArr.length);
        int[] newArr1 = {10,2,30,4,5};
        System.out.println(newArr1.length);

        int[] arr = new int[10];
        int count= 20;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =count++;
        }
        arr[1] = 67;
        arr[3] = 75;
        printArr(arr);

        System.out.println("Sorted ? ");
        Arrays.sort(newArr1);
        for (int i :
                newArr1) {
            System.out.print(i + " ");
        }
        System.out.println();


//        int[] newArr3 =  sortArrayAscendingOrder(arr);
//        printArr(newArr3);
        int[] newArr4 =  sortArray(arr);
        printArr(newArr4);

    }
    public static int[] sortArray(int[] copyArray) {
        Arrays.sort(copyArray);
        return copyArray;
    }

//    public static Object[] sortArrayDesc(int[] copyArray) {
//        List l = Arrays.asList(copyArray);
//        return l.toArray();
//
////        Arrays.sort(copyArray);
////        return copyArray;
//    }
//    public static int[] sortArrayAscendingOrder(int[] copyArray) {
////        List l =  Arrays.asList(copyArray);
////        int[] arrDesc = new int[copyArray.length];
////        Collections.sort(l, Collections.reverseOrder());
////        int count=0;
////        for (Object o : l) {
////            arrDesc[count++] = i;
////        }
////        return arrDesc;
//    }
    public static void printArr(int[] arr){
        for (int i :
                arr) {
            System.out.print(i+ "\t");
        }
        System.out.println();
    }
}
