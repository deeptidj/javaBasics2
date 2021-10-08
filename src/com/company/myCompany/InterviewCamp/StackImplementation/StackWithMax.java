package com.company.myCompany.InterviewCamp.StackImplementation;

public class StackWithMax {
    MyStack stack;
    MyStack max;
    StackWithMax(){
        stack = new MyStack();
        max = new MyStack();
    }
    public void push(int number){
        stack.push(number);
        if (max.isEmpty() || number > max.peek()) max.push(number);
    }
    void print() {
       stack.print();
    }
    public int pop() {
        if (stack.isEmpty()) throw new IllegalArgumentException();

        int popedItem = stack.pop();

        if(popedItem == max.peek()) max.pop();
        return popedItem;
    }

    public int max() {
        if (max.isEmpty()) throw new IllegalArgumentException();
        int maxNum = max.peek();
        return maxNum;
    }

}
