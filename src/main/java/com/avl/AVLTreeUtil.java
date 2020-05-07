package com.avl;

public class AVLTreeUtil {

     static class Node {
        Node left, right, next;
        int data, height, size;

         static Node newNode(int data){
            Node n = new Node();
            n.left = null;
            n.right = null;
            n.data = data;
            return n;
        }
    }

    public int height(Node root){
         if(root == null)
             return 0;
         return root.height;
    }

    public int setHeight(Node root){
         if(root == null)
             return 0;
         return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right !=null ? root.right.height : 0));
    }

    public int setSize(Node root) {
         if(root == null)
             return 0;
         return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right!=null ? root.right.height : 0) );
    }

    public int balance(Node rootLeft, Node rootRight){
        return height( rootLeft ) - height( rootRight );
    }

    public Node leftRotation(Node root) {
         Node newRoot = root.right;
         root.right =  root.right.left;
         newRoot.left = root;
         root.height = setHeight( root );
         root.size = setSize( root );
         newRoot.height = setHeight( newRoot );
         newRoot.size = setSize(  newRoot  );
         return newRoot;
    }


    public Node rightRotation(Node root){
         Node newRoot = root.left;
         root.left = root.left.right;
         newRoot.right = root;
         root.height = setHeight( root );
         root.size = setSize( root );
         newRoot.height = setHeight( newRoot );
         newRoot.size = setSize( newRoot );
         return newRoot;
    }

    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder( root.left );
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder( root.right );
    }

    public Node insert(Node root, int data) {
        if(root == null){
            return Node.newNode(data);
        }
        if(root.data <= data){
            root.right = insert(root.right,data);
        }
        else{
            root.left = insert(root.left,data);
        }
        root = reBalance( root );
        return root;
    }

    public Node reBalance(Node root) {
        int balance = balance(root.left, root.right);
        if(balance > 1){
            if(height(root.left.left) >= height(root.left.right)){
                root = rightRotation(root);
            }else{
                root.left = leftRotation(root.left);
                root = rightRotation(root);
            }
        }else if(balance < -1){
            if(height(root.right.right) >= height(root.right.left)){
                root = leftRotation(root);
            }else{
                root.right = rightRotation(root.right);
                root = leftRotation(root);
            }
        }
        else{
            root.height = setHeight(root);
            root.size = setSize(root);
        }
        return root;
    }

    public Node delete(Node node, int key) {
        if (node == null) {
            return node;
        } else if (node.data > key) {
            node.left = delete(node.left, key);
        } else if (node.data < key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left == null) ? node.right : node.left;
            } else {
                Node mostLeftChild = mostLeftChild(node.right);
                node.data = mostLeftChild.data;
                node.right = delete(node.right, node.data);
            }
        }
        if (node != null) {
            node = reBalance(node);
        }
        return node;
    }

    private Node mostLeftChild(Node node) {
        Node current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
}
