package com.company.myCompany.basicJava.BinaryTreeExamples;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (this.data == value) {
            return; //duplicate is not allowed so returning.
        } else if (this.data > value) {
            if (left == null){
               left = new TreeNode(value);
            } else {
              left.insert(value);
            }
        } else if (this.data < value) {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }
    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.print(this.data + " , ");
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }
    public void traversePreOrder() {
        System.out.print(this.data + " , ");
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }
    public int min() {
        if (this.left == null) {
            return this.data;
        } else return this.left.min();
    }
    public int max() {
        if (this.right == null) {
            return this.data;
        } else return this.right.max();
    }
    public TreeNode get(int val) {
        if (data == val) {
            return this;
        }
        if (val < data) {
            if (left != null) return left.get(val);
        }
        else if (val > data){
            if (right != null) return  right.get(val);
        }
        return null;
     }
    public void traversePostOrder() {
        if (this.left != null) {
            this.left.traversePostOrder();
        }
        if (this.right != null) {
            this.right.traversePostOrder();
        }
        System.out.print(this.data + " , ");
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
