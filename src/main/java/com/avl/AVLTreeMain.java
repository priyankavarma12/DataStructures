package com.avl;

import static com.avl.AVLTreeUtil.*;

public class AVLTreeMain {

    public static void main(String args[]){
        AVLTreeUtil avlTreeMain = new AVLTreeUtil();
        Node root = null;
        root = avlTreeMain.insert(root, -10);
        root = avlTreeMain.insert(root, 2);
        root = avlTreeMain.insert(root, 13);
        root = avlTreeMain.insert(root, -13);
        root = avlTreeMain.insert(root, -15);
        root = avlTreeMain.insert(root, 15);
        root = avlTreeMain.insert(root, 17);
        root = avlTreeMain.insert(root, 20);

        inOrder(root);
        System.out.println();
        preOrder(root);

    }
}
