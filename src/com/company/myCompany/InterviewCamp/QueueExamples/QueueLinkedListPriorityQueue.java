package com.company.myCompany.InterviewCamp.QueueExamples;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLinkedListPriorityQueue {
    public static void main(String[] args) {
       // linkedListQueue();
        priorityQueue();
    }
    static void linkedListQueue() {
        Queue<String> q1 = new LinkedList<String>();


        q1.add("test1");
        q1.add("test2");
        q1.add("test3");
        q1.add("test4");
        q1.add("test5");

        System.out.println(q1);
        // element() - Returns the head of the queue. Head is the first element of the queue.
        System.out.println("Head "+q1.element());
        System.out.println(q1);

        //Removes and returns the head of the queue
        System.out.println("Poll "+q1.poll());
        System.out.println(q1);

        //Same as the element() methos, however it returns null id the queue is empty.
        System.out.println("Peek "+q1.peek());
        System.out.println(q1);
    }

    static void priorityQueue(){
        PriorityQueue<String> q = new PriorityQueue<String>(15, new MyComparator());

        q.add("sfsdfsdfsd");
        q.add("423efewrwe");
        q.add("9090fhfghfghfg");
        q.add("123456789");
        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Comparator
         */
        while(q.size() != 0) {
            System.out.println("Removing the highest priority element from the priority queue"
                    +q.poll());
        }

    }

    static class MyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
