package com.company.myCompany.InterviewCamp.StackImplementation;

public class QueueUsing2Stacks {
    /*
    fifo
    cap
     out <= | 1 | 2 | 3 | 4 | <= In

     */
    public static void main(String[] args) throws Exception {
//        //Queue
        MyQueue q1 = new MyQueue();
        q1.add(1); //adds to the end of the list
        q1.add(2); //adds to the end of the list
        q1.add(3); //adds to the end of the list
        q1.add(5); //adds to the end of the list
        q1.add(8); //adds to the end of the list
        System.out.println("Removed this element = " +q1.remove());
        System.out.println("Removed this element = " +q1.remove());
        System.out.println("Removed this element = " +q1.remove());
        System.out.println("Removed this element = " +q1.remove());
        System.out.println("Removed this element = " +q1.remove());

    }
}
