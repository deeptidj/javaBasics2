package com.company.myCompany.basicJava.BinaryTreeExamples;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(25);
        t.insert(20);
        t.insert(30);
        t.insert(5);
        t.insert(1);
        t.insert(12);
        t.insert(43);

        t.traversalInOrder();
        System.out.println();
        t.traversalPreOrder();
        System.out.println();
        t.traversalPostOrder();
        System.out.println();

        System.out.println("Get node 25");
        TreeNode res = t.get(25);
        System.out.println("Left child = " +res.left.data);
        System.out.println("Right child = " +res.right.data);


        System.out.println("Get node 888");
        res = t.get(888);
        System.out.println(res);

        System.out.println("Min in the tree");
        int min = t.min();
        System.out.println("Min values = "+min);

        System.out.println("Max in the tree");
        int max = t.max();
        System.out.println("Max values = "+max);

        System.out.println("Delete node in the tree 1");
        t.delete(1);
        System.out.println("Deleted");
        t.traversalInOrder();
    }
}
