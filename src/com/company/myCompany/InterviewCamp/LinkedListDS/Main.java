package com.company.myCompany.InterviewCamp.LinkedListDS;

public class Main {
    public static void main(String[] args) {
        createLoopesLL();

//        LinkedList l1 = new LinkedList();
//        l1.create123();
//     //   l1.print();
//        l1.append(4);
//        l1.append(5);
////        Node n = l1.getNthNode(3);
////        System.out.println(n.d);
//        l1.append(1);
//        l1.append(2);
//        l1.append(3);
//        l1.append(6);
//        l1.append(7);
//        l1.append(7);
//        l1.append(7);
//        l1.append(7);
//        l1.append(8);
//        l1.append(9);
//        l1.print();
////        Node n1 = new Node(7);
////        l1.delete(n1);
      //  l1.sort().print();


    }
    public static void createLoopesLL() {
        LinkedList looped = new LinkedList();
        looped.append(1);
        looped.append(2);
        looped.append(3);
        looped.append(4);
        looped.append(5);
        looped.append(6);
        looped.append(7);
        looped.append(8);
        looped.append(9);
        looped.append(10);

        looped.print();
        Node n = looped.getNthNode(3);
        Node n3 = looped.getNthNode(2);
        n.next = n3;
        System.out.println(looped.isLoop());

    }
}
