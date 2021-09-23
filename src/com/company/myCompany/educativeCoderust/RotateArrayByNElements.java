package com.company.myCompany.educativeCoderust;

public class RotateArrayByNElements {
    public static void main(String[] args) {
        rotateArray(-1, new int[]{1,2,3,4,5});
    }
    static int[] rotateArray(int n, int[] arr) {
        if (n == 0) {
            return arr;
        }
        if (n > 0) {
            //right rotation

        } else {
            //left rotation
            //[1,2,3,4,5] n=2 [4,5,1,2,3]
            int temp;
            int i = 0;
            int k;
            while (i < arr.length - 1) {
                k = i + n; //k = 2,3,4%4,5%4=1
                if (k >= (arr.length - 1)) {
                    k = k % (arr.length - 1);
                }
                temp = arr[k]; // 3 , 4
                arr[k] = arr[i]; //[1,2,1,4,5] // i = 1//[1,2,1,2,3]

                i++;//1,2,3
            }

        }

        return arr;
    }}
