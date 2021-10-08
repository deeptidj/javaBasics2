package com.company.myCompany.InterviewCamp.QueueExamples;

public class CircularQueue {
    //front and end - circular int[]
    final static int capacity = 50;
    int[] cirQ;
    int frontIndex;
    int backIndex;
    int length;
    CircularQueue(){
        cirQ  = new int[capacity];
        frontIndex = 0;
        backIndex = 0;
        length = 0;
    }

    void enqueue(int n){
        if(length == capacity) {
            throw new IllegalArgumentException();
        }
        cirQ[backIndex] = n;
        backIndex = (backIndex +1 )% cirQ.length;

    }

    int dequeue() {
        return -1;
    }
}
