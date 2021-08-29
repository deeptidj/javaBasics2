package com.company.myCompany.crackingCoding;

import java.util.HashSet;

public class SingleLinkedList {
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //head of ll
    public Node head = null ;

    //to add nodes to an existing ll or create one if ll does not exists.
    public void addNode(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
        } else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
    }
    public void display() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public void removeDupsWithBuffer() {
        Node curr = head, prev = head;
        HashSet<Integer> hs = new HashSet<>();
        while (curr != null) {
            if (hs.contains(curr.data) ) {
                prev.next = curr.next;
            } else {
                hs.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }
    public void removeDups() {
        //if length is then return.
        // 50 -> 10 -> 20 -> 10 -> 30 -> 50 -> null
        /*

        */
        Node curr= head;
        Node runn = head;
        Node prev = head;

        while(curr.next != null) {
            runn = curr.next;
            prev = curr;
            while (runn.next != null) {
                if (curr.data == runn.data) {
                    prev.next = runn.next;
                } else {
                    prev = runn;
                    runn = runn.next;
                }
                runn = runn.next;
            }
            curr = curr.next;
            //reset runner.
        }
    }
    public static void main(String[] args) {
    SingleLinkedList ll = new SingleLinkedList();
    ll.addNode(50);
    ll.addNode(10);
    ll.addNode(20);
    ll.addNode(10);
    ll.addNode(30);
    ll.addNode(40);
    ll.addNode(50);

    ll.display();
    ll.removeDupsWithBuffer();
    ll.display();

    }
}
