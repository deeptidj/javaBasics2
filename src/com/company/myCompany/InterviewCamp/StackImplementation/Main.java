package com.company.myCompany.InterviewCamp.StackImplementation;

public class Main {
    public static void main(String[] args) throws Exception {

        StackWithMax s = new StackWithMax();
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);
        s.push(11);
        s.push(13);

        s.print();
        System.out.println();
        System.out.println(s.pop());
        s.print();
        System.out.println();
        System.out.println(s.max());
//        s.pop();
//        s.pop();

     //   System.out.println(s.max);

//        MyStack s = new MyStack();
//        for (int i = 0; i < 10; i++) {
//            s.push(i);
//        }
//        s.print();
//        System.out.println();
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        s.push(1);
//        s.print();
//
//        System.out.println("Found = "+s.find(1));
//
//        ArrayToImplement2Stacks a = new ArrayToImplement2Stacks();
//        for (int i = 0; i < 10; i++) {
//            a.push(i);
//        }
//        a.print();
//        System.out.println();
//
//        System.out.println("Popped element = "+a.pop());
//        a.print();
//        System.out.println();
    }
}
