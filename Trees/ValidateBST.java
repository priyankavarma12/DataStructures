package com.trees;

public class ValidateBST {

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

    private boolean isBST(TreeNode root, int min, int max) {
        if(root == null)
            return true;
        if(root.data <= min ||  max <= root.data)
            return false;
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    private boolean isValidBST(TreeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode insert(int data, TreeNode root){
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


    public static void main(String[] args) {
        ValidateBST tree = new ValidateBST();
        TreeNode root = null;
        //Not BST
        root = tree.insert(5, root);
        root = tree.insert(1, root);
        root = tree.insert(4, root);
        root = tree.insert(0, root);
        root = tree.insert(0, root);
        root = tree.insert(3, root);
        root = tree.insert(6, root);

       //for BST
       /* root = tree.insert(10, root);
        root = tree.insert(15, root);
        root = tree.insert(-10, root);
        root = tree.insert(17, root);
        root = tree.insert(20, root);
        root = tree.insert(0, root);*/

        System.out.println("Given Tree is BST or not ? "+tree.isValidBST(root));
        if(tree.isValidBST(root))
            System.out.println("Is a valid BST ");
         else
            System.out.println("Is not a valid BST ");
    }

}
