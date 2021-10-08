package com.company.myCompany.InterviewCamp.StackImplementation;

public class MyQueue {
        MyStack s1;
        MyStack s2;

    MyQueue(){
        s1 = new MyStack();
        s2 = new MyStack();
    }

    void add(int number) throws Exception {
        // 1 2 3 4
        if (s1.isFull()) {
            throw new Exception("Full");
        }
        s1.push(number);
        System.out.println(number + " added to the queue");
    }
    int remove() throws Exception {
        if(s1.isEmpty()) {
            throw new Exception("Empty");
        }
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return res;
    }
}
