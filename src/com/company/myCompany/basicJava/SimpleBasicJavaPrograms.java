package com.company.myCompany.basicJava;

public class SimpleBasicJavaPrograms {
    public static int n1=0, n2=1,sum;
    public static void main(String[] args) {
        System.out.println(" Start");
        fib(10);

        System.out.println("Recursion ");
        System.out.print("0 ");
        System.out.print("1 ");
        fibRecursion(10);

    }
    public static void fib(int count){
        int n1 = 0;
        int n2 = 1;
        int sum ;
        System.out.print(n1+ " ");
        System.out.print(n2+" ");
        for (int i = 0; i < count; i++) {
            sum = n1 + n2;
            System.out.print(sum+ " ");
            n1 = n2;
            n2 = sum;

        }
    }
    public static void fibRecursion(int n) {

        if (n==0) {
            return;
        } else {
             sum = n1 + n2;
            System.out.print(sum+" ");
            n1=n2;
            n2= sum;
            fibRecursion(n-1);
        }
    }
}
