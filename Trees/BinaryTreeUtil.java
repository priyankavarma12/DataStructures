package com.trees;

public class BinaryTreeUtil {

     static class TreeNode {
        int data;
        TreeNode left, right;

        static TreeNode newNode(int data) {
            TreeNode n = new TreeNode();
            n.left = null;
            n.right = null;
            n.data = data;
            return n;
        }
    }

    public TreeNode insert(int data, TreeNode root){
        TreeNode tempRoot = root;
        TreeNode node = TreeNode.newNode(data);
        if(root == null){
            root = node;
            return root;
        }

        TreeNode parent = null, current = root;
        while(current != null) {
            parent = current;
            if(current.data < data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        if(parent.data < data) {
            parent.right = node;
        } else {
            parent.left = node;
        }
        return tempRoot;
    }

    public boolean isBST(TreeNode root, int min, int max) {
        if(root == null)
            return true;
        if(root.data <= min ||  max <= root.data)
            return false;
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    public boolean isValidBST(TreeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isSymmetric(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        return (t1.data == t2.data)
                && isSymmetric(t1.left, t2.right)
                && isSymmetric(t1.right, t2.left);
    }

    public boolean isValidSymmetric(TreeNode root){
        return isSymmetric(root, root);
    }
}
