package com.trees;

public class ValidateSymmetricBT {

    public static void main(String[] args) {
        ValidateSymmetricBT tree = new ValidateSymmetricBT();
        BinaryTreeUtil btUtil = new BinaryTreeUtil();
        BinaryTreeUtil.TreeNode root = null;

        //Not Symmetry
        root = btUtil.insert(1, root);
        root = btUtil.insert(2, root);
        root = btUtil.insert(2, root);
        root = btUtil.insert(3, root);
        root = btUtil.insert(4, root);
        root = btUtil.insert(4, root);
        root = btUtil.insert(3, root);

        System.out.println("Given Tree is Symmetric or not ? " + btUtil.isValidSymmetric(root));
        if (btUtil.isValidSymmetric(root)) {
            System.out.println("Is a valid Symmetric ");
        } else {
            System.out.println("Is not a valid Symmetric ");
        }

    }
}
