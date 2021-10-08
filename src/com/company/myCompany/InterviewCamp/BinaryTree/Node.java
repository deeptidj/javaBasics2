package com.company.myCompany.InterviewCamp.BinaryTree;

public class Node {
    int data ;
    Node left;
    Node right;

    Node(int value) {
        this.data = value;
        right = null;
        left = null;
    }

    void insert(int d) {
        if (this.data == d) {
            throw new IllegalArgumentException("Duplicate are not allowed");
        }
        if (d < this.data) {
            if (left == null) this.left = new Node(d);
            else left.insert(d);
        }
        else {
            if (right == null) {
                this.right = new Node(d);
            } else right.insert(d);
        }
    }


    void print() {
        System.out.print(this.data +" ");
    }

    void inOrderTraversal() {
        if (left != null) this.left.inOrderTraversal();
        System.out.print(this.data +" , ");
        if (right != null) this.right.inOrderTraversal();
    }
    void preOrderTraversal() {
        System.out.print(this.data +" , ");
        if (this.left != null) this.left.preOrderTraversal();
        if (this.right != null) this.right.preOrderTraversal();
    }
    void postOrderTraversal() {
        if (left != null) left.postOrderTraversal();
        if (right != null) right.postOrderTraversal();
        System.out.print(this.data +" , ");
    }

}
