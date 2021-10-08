package com.company.myCompany.InterviewCamp.LinkedListDS;

import java.util.Map;
import java.util.TreeMap;

public class LinkedList {
    Node head;
    Node tail;
    LinkedList() {}
    LinkedList(Node n) {
        if (head == null) {
            head = new Node(n.d);
            tail = head;
        }
    }
    public void create123() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        this.head = n1;
        n1.next = n2;
        n2.next = n3;
        tail = n3;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }
    public void append(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = n;
            tail = n;
        }
    }
    public Node getNthNode(int n) {
        if (head == null) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < n-1; i++) {
            if (current != null) current = current.next;
            else {
                throw new IndexOutOfBoundsException("No node at index "+n);
            }
        }
        return current;
    }
    public void delete(Node n, Node prev ){
        if (n == null) return;

        if (n == head) {
            head = n.next;
        } else if (n == tail) {
            tail = prev;
        }

        if (prev != null) {
            prev.next = n.next;
        }
    }

    public void delete(Node n) {
        if (head == null) return;
        Node cur = head;
        Node prev = head;
        while (cur != null) {
            if (cur.d == n.d) {
                prev.next = cur.next;
            }
            prev = cur;
            cur = cur.next;

        }
    }
    //Linked List contains duplicates
    // It contains 0 and negative numbers;
    public LinkedList sort() {
        if (head == null) return null;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Node curr = head;
        while(curr != null) {
            map.put(curr.d, map.getOrDefault(curr.d, 0)+1);
            curr = curr.next;
        }
     //   System.out.println(map);
        LinkedList sortedList = new LinkedList();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                //System.out.print(entry.getKey()+ " ");
                sortedList.append(entry.getKey());
            }
        }
        return sortedList;
    }
    public boolean isLoop() {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;

        while(fast.next != null) {
            fast = fast.next;
            if (slow == fast) return true;
            slow = slow.next;
            if (fast.next != null) fast = fast.next;
            else break;
        }

        return false;
    }
    public void print() {
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.d + " => ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.d);
        System.out.println();
    }
    public boolean isPalindrome() {
        if (head == null ) return false;

        Node slow = head;
        Node fast = head;
        while(fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = slow;
        Node curr = slow.next;

        while(curr != null) {
            Node next = curr.next;
            System.out.println(prev.d);
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = prev;

         Node left = head;
         Node right = tail;
        while(left != slow && right != slow){
            if (left.d != right.d) return false;
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public void reverseLinkedList() {
        if (head == null) return;
        if (head.next == null) return;
        Node prev = null;
        Node curr = head;
      //  Node next = head.next;
       // System.out.print(curr.d + "  "+next.d);
        System.out.println();
//        if(head.next.next != null) next = head.next.next; else {
//            Node t = tail;
//            tail = head;
//            head = t;
//        }
        Node next;
        while(curr != null) {
            System.out.println(curr.d);

             next = curr.next;
            curr.next = prev;

//            next.next = curr;

            prev = curr;
            curr = next;
           // next = next.next;
        }
        head = prev;
    }
}
