package com.company.myCompany.basicJava.BinaryTreeExamples;

public class Tree {
    TreeNode root;
    Tree() {
        root = null;
    }
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
    public int min() {
        int res = Integer.MAX_VALUE;
        if (this.root != null){
            res = root.min();
        }
        return res;
    }
    public int max() {
        int res = Integer.MIN_VALUE;
        if (this.root != null){
            res = root.max();
        }
        return res;
    }
    public TreeNode get(int val) {  
        TreeNode res = null;
        if (this.root != null) {
           res = root.get(val);
        }
        return res;
    }
    public void traversalInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
    public void traversalPreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }
    public void traversalPostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
    }
    private TreeNode delete(TreeNode subTreeRoot, int val) {
        if (subTreeRoot == null) {
         return subTreeRoot;
        }
        if (val < subTreeRoot.getData()) {
            subTreeRoot.setLeft(delete(subTreeRoot.getLeft(), val));
        } else if (val > subTreeRoot.getData()) {
            subTreeRoot.setRight(delete(subTreeRoot.getRight(), val));
        } else {
            // case where subTreeroot has 0 or 1 child
            if (subTreeRoot.getLeft() == null) {
                return subTreeRoot.getRight();
            } else if (subTreeRoot.getRight() == null) {
                return subTreeRoot.getLeft();
            }
        }


        return subTreeRoot;
    }
    public void delete(int val) {
       TreeNode t = delete(root,val);
    }
}
