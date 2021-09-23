package com.company.myCompany.basicJava.DequeExamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExamples {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque();
        deque.offer(123);
        Integer ele = deque.poll();

        System.out.println(ele);


        Deque deque1 = new LinkedList();
        deque1.offer(3);
        deque1.offer(4);
        Integer ele1 = (Integer) deque.poll();
        System.out.println(ele1);


    }
}
