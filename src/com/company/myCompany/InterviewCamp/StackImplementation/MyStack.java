package com.company.myCompany.InterviewCamp.StackImplementation;

import java.util.EmptyStackException;

public class MyStack {
    int[] stack;
    final static int capacity = 10;
    int top;
    MyStack() {
        stack = new int[capacity];

        top = -1;
    }
    void print() {
        for (int i : stack) {
            System.out.print(i+" ");
        }
    }
    int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }
    void push(int n) {
        if (top == capacity) try {
            throw new Exception("Stack is full");
        } catch (Exception e) {
            e.printStackTrace();
        }
        stack[++top] = n;
    }
    boolean isEmpty() {
        return top == -1;
    }
    boolean isFull() {
        return top == capacity;
    }
    int peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stack[top];
    }
    //Find if the element n exists in the stack.
    boolean find(int n) {
        boolean found = false;
        MyStack temp = new MyStack();
        int n1;
        System.out.println();
        while(!this.isEmpty()) {
            n1 =  this.pop();
            System.out.print(n1+ " ");
            if (n1 == n) {
                found = true;
            }
            temp.push(n1);
        }
        return found;
    }

}
