package com.company.myCompany.crackingCoding;

import java.awt.*;

public class RotateMatrix {
    public static void main(String[] args) {
        System.out.println("Matrix");
        int count = 1;
        int N = 3;
        int[][] m = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                m[i][j] = count++;
            }
            System.out.println();
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }


        for (int layer = 0; layer < N/2; layer++) {
            int first = layer;
            int last = N - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                // save top
                int top = m[first][i];
                //left -> top
                m[first][i] = m[last-offset][first];

                //bottom -> left
                m[last-offset][first] = m[last][last-offset];

                //right -> bottom
                m[last][last-offset] = m[i][last];

                //top -> saved
                m[i][last] = top;

            }
            System.out.println();
        }




        //
//        int left = 0 ; int right = m[0].length;
//        int top = 0 ; int bottom = m[0].length;
//        for (int layer = 0; layer < N/2  ; layer++) {
//            for (int i = left; i < right; i++) {
//
//            }
//        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }



    }
}
