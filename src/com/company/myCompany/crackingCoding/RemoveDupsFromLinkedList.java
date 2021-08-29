package com.company.myCompany.crackingCoding;

import java.util.HashSet;

public class RemoveDupsFromLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node list1 = ll.createLL123();
        ll.print();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.print();
        //ll.removeDups();
        //ll.print();
        System.out.println(ll.nthToLastElement(3));
    }
}
class LinkedList{
    Node head;
    LinkedList() {
        head = null;
    }
    Node createLL123() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        this.head = n1;
        return head;
    }
    void add(int d) {
        Node cur = head;
        Node newNode = new Node(d);
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }
    void removeDups() {
        Node cur = head;
        Node prev = head;
        HashSet<Integer> hs = new HashSet<>();
        while(cur != null) {
            if (hs.contains(cur.data)) {
                prev.next = cur.next;
            } else {
                hs.add(cur.data);
                prev = cur;
            }
            cur = cur.next;
        }
    }
    int nthToLastElement(int Nth) {
        Node p1 = head; Node p2 = head;
        for (int i = 0; i <Nth -1; i++) {
            if (p2 == null) return -1;
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.data;
    }
    void print() {
        Node cur = head;
        while(cur.next != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println(cur.data);
        System.out.println();
    }
}
class Node {
    int data;
    Node next;
    Node() {
        this(0);
    }
    Node(int data) {
        this.data = data;
        next = null;
    }
}
