package com.company.deeps;

public class Equil {
   /* EquiIndex
    The equilibrium index of a sequence is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in a sequence A:
            [-7, 1, 5, 2, -4, 3, 0]
            3 is an equilibrium index, because:
    A[0]+A[1]+A[2]=A[4]+A[5]+A[6]
            6 is also an equilibrium index, because:
    A[0]+A[1]+A[2]+A[3]+A[4]+A[5]=0
            (The sum of zero elements is zero) 7 is not an equilibrium index - because it is not a valid index of sequence A. If you still have doubts, here is a precise definition: The integer k is an equilibrium index of a sequence A[0],A[1]..,A[n-1] if and only if 0<= k and sum(A[0..(k-1)])=sum(A[(k+1)..(n-1)]). Assume the sum of zero elements is equal to zero.
    Write a function
    int equi(int[] A)
    that, given a sequence, returns its equilibrium index (any) or -1 if no equilibrium index exists. Assume that the sequence may be very long.
    JAVA CREATED BY SERGIO BILELLO ABOUT 2 YEARS AGO */

    /*
    The equilibrium index of a sequence is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in a sequence A:
    [-7, 1, 5, 2, -4, 3, 0]
    3 is an equilibrium index, because:
    A[0]+A[1]+A[2]=A[4]+A[5]+A[6]
    6 is also an equilibrium index, because:
    A[0]+A[1]+A[2]+A[3]+A[4]+A[5]=0
    (The sum of zero elements is zero) 7 is not an equilibrium index - because it is not a valid index of sequence A. If you still have doubts, here is a precise definition: The integer k is an equilibrium index of a sequence A[0],A[1]..,A[n-1] if and only if 0<= k and sum(A[0..(k-1)])=sum(A[(k+1)..(n-1)]). Assume the sum of zero elements is equal to zero.
    Write a function
    int equi(int[] A)
    that, given a sequence, returns its equilibrium index (any) or -1 if no equilibrium index exists. Assume that the sequence may be very long.
     */
    public static void main(String[] args) {

        int[] arr1 = new int[]{-7, 1, 5, 2, -4, 3, 0};
        int[] arr2 = new int[]{6, 1, 5, 2, -4, 3, 0};
        int[] arr3 = new int[]{6, 10, 5, 2, 1, 3, 10};
        int[] arr4 = new int[]{6, 4, 5, 2, 1, 3, 4};
        System.out.println(equi(arr1));
        System.out.println();
        System.out.println(equi(arr2));
        System.out.println();
        System.out.println(equi(arr3));
        System.out.println();
        System.out.println(equi(arr4));
        System.out.println();

    }

//    public static int equi(int[] input) {
//        int equiIndex = 0;
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(input[i]+ " ");
//        }
//        System.out.println();
//        int[] sumOfElementsLeft = new int[input.length];
//        int sum;
//        for (int i = 0; i < input.length; i++) {
//            sum = 0;
//            for (int j = 0; j <= i; j++) {
//                sum = sum + input[j];
//            }
//            sumOfElementsLeft[i] = sum;
//        }
//
//        int[] sumOfElementsRight = new int[input.length];
//        for (int i = input.length-1 ; i >= 0; i--) {
//            sum = 0;
//            for (int j = input.length-1 ; j >= i; j--) {
//                sum = sum + input[j];
//            }
//            sumOfElementsRight[i] = sum;
//        }
//
//        //System.out.println("Array left length "+sumOfElementsLeft.length);
//
//        for (int i = 0; i < sumOfElementsLeft.length; i++) {
//            System.out.print(sumOfElementsLeft[i] + " ");
//        }
//        System.out.println();
//
//       // System.out.println("Array right length "+sumOfElementsRight.length);
//        for (int i = 0; i < sumOfElementsRight.length; i++) {
//            System.out.print(sumOfElementsRight[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < sumOfElementsLeft.length; i++) {
//            if(sumOfElementsLeft[i] == sumOfElementsRight[i])
//                equiIndex = i;
//        }
//        return equiIndex;
//    }

    public static int equi(int[] input) {

        for (int i = 1; i < input.length - 2; i++) {
            int sumL= 0, sumR =0;
            for (int j = 0; j < i; j++) {
                sumL = sumL + input[j];
            }
            for (int j = input.length-1 ; j > i ; j--) {
                sumR = sumR + input[j];
            }
            if (sumL == sumR) return i;
        }
        return -1;
    }
}


