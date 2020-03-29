package com.linkedlist;

public class DoublyLinkedListUtil {

     Node head;

    class Node {
        int val;
        Node next, prev;
        Node (int x) {val = x;}
    }

    public DoublyLinkedListUtil(){
        head = null;
    }

    //fun to return the index node in linked list
    public Node getNode(int index) {
        Node cur = head;
        for(int i = 0; i< index && cur!= null; ++i) {
            cur = cur.next;
        }
        return cur;
    }

    public Node getTail () {
        Node cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public int get(int index) {
        Node cur = getNode(index);
        return cur == null ? -1 : cur.val;
    }


    public void addAtHead (int val) {
        Node cur = new Node(val);
        cur.next = head;
        if (head != null) {
            head.prev = cur;
        }
        head = cur;
        return;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node prev = getTail();
        Node cur = new Node(val);
        prev.next = cur;
        cur.prev = prev;
    }


    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node prev = getNode(index - 1);
        if (prev == null) {
            return;
        }
        Node cur = new Node(val);
        Node next = prev.next;
        cur.prev = prev;
        cur.next = next;
        prev.next = cur;
        if (next != null) {
            next.prev = cur;
        }
    }

    public void deleteAtIndex(int index) {
        Node cur = getNode(index);
        if (cur == null) {
            return;
        }
        Node prev = cur.prev;
        Node next = cur.next;
        if (prev != null) {
            prev.next = next;
        } else {
            // modify head when deleting the first node.
            head = next;
        }
        if (next != null) {
            next.prev = prev;
        }
    }

    public void printList(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.val + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.val + " ");
            last = last.prev;
        }
    }

    public void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
}
