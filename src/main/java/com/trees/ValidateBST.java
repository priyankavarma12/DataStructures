package com.trees;

public class ValidateBST {

    public static void main(String[] args) {

        ValidateBST tree = new ValidateBST();
        BinaryTreeUtil btUtil = new BinaryTreeUtil();
        BinaryTreeUtil.TreeNode root = null;

        //Not BST
        /*root = btUtil.insert(5, root);
        root = btUtil.insert(1, root);
        root = btUtil.insert(4, root);
        root = btUtil.insert(0, root);
        root = btUtil.insert(0, root);
        root = btUtil.insert(3, root);
        root = btUtil.insert(6, root);*/

        //for BST
        root = btUtil.insert(10, root);
        root = btUtil.insert(15, root);
        root = btUtil.insert(-10, root);
        root = btUtil.insert(17, root);
        root = btUtil.insert(20, root);
        root = btUtil.insert(0, root);


        System.out.println("Given Tree is BST or not ? " + btUtil.isValidBST(root));
        if (btUtil.isValidBST(root)) {
            System.out.println("Is a valid BST ");
        } else {
            System.out.println("Is not a valid BST ");
        }

    }
}
