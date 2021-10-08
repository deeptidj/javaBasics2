package com.company.myCompany.InterviewCamp.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(15);
        bt.insert(25);
        bt.insert(0);
        bt.inOrderTraversal();
        System.out.println();
        System.out.println("Pre");
        bt.preOrderTraversal();
        System.out.println();
        System.out.println("Post");
        bt.postOrderTraversal();

    }
}
