package com.company.myCompany.InterviewCamp.BinaryTree;


public class BinaryTree {
    Node root;
    BinaryTree(){
        root = null;
    }
    void insert(int d){
        if (root == null) {
            root = new Node(d);
        }
        else root.insert(d);
    }
//    void printTree() {
//        if (root != null) {
//            if (root.left != null) root.left.print();
//            root.print();
//            if (root.right != null) root.right.print();
//        }
//    }
    public void inOrderTraversal() {
        if (root != null) root.inOrderTraversal();
    }
    public void preOrderTraversal() {
        if (root != null) root.preOrderTraversal();
    }
    public void postOrderTraversal() {
        if (root != null) root.postOrderTraversal();
    }
}
