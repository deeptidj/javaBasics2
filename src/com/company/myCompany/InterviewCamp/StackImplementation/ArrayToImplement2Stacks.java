package com.company.myCompany.InterviewCamp.StackImplementation;

public class ArrayToImplement2Stacks {
    int capacity = 100;
    int top1 = -1;
    int top2 = 101;

    int[] arr = new int[capacity];

    void print() {
        for (int i : arr) {
            System.out.print(i);
        }
    }
    void push(int num) throws Exception {
        if (top1 == 50 && top2 == 51) {
            throw new Exception("Both stacks are full");
        }

        if (top1 < 50) { // stack 1 has space then puch it in the stack 1 first
            arr[++top1] = num;
        } else if (top2 > 51) { //stack sesems to be full
            arr[--top2] = num;
        }
    }
    int pop() throws Exception {
        int res=0;

        if (top2 == 101 && top1 == -1) {
            throw new Exception("Both stacks are empty");
        }
        if (top2 < 101 && top2 > 50) {
            res = arr[top2--];
        } else if (top1 > -1 && top1 < 51) { //stack 2 is not empty
            res = arr[top1--];
        }
        return  res;
    }

}
