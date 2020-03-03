package com.stacks;

import java.util.Stack;

public class StackOperationsUsingArrays implements StackInterface {

    static final int MAX_SIZE = 50;
    int top;
    int a[] = new int[MAX_SIZE];

    public StackOperationsUsingArrays(){
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top<0;
    }

    @Override
    public boolean push(int item) {
      if(top >= MAX_SIZE -1 ) {
          System.out.println("Stack Overflow");
          return false;
      } else {
          a[++top] = item;
          return true;
      }
    }

    @Override
    public int pop() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
           int x = a[top--];
            return x;
        }
    }

    @Override
    public int peek() {
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        } else {
            int data = a[top];
            return data;
        }
    }

    @Override
    public void reverse(Stack stack) {
        if(stack.isEmpty()==false){
            int data = (int) stack.pop();
            reverse( stack);
            insertAtBottom(stack, data);
        }
    }

    public boolean insertAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return true;
        }
        int existing_item = stack.pop();
        insertAtBottom(stack, data);
        stack.push(existing_item);
        return false;
    }

    public void printStack() {
        System.out.println("Stack :: ");
        for(int i=0; i<=top; i++){
            System.out.print(" "+a[i]);
        }
        System.out.print("\n");
    }
}
