package com.stacks;

import java.util.Stack;

public class StackMain {

   private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {

        StackOperationsUsingArrays stackOpsArr = new StackOperationsUsingArrays();
        System.out.println("Stack Operations :: ");
        stackOpsArr.push(2);
        stackOpsArr.printStack();
        stackOpsArr.push(5);
        stackOpsArr.printStack();
        stackOpsArr.pop();
        stackOpsArr.printStack();
        stackOpsArr.push(6);
        stackOpsArr.printStack();
        //stackOpsArr.peek();
        stackOpsArr.push(7);
        stackOpsArr.printStack();

        System.out.println("Reverse stack using recursion");
        StackOperationsUsingArrays stackReverse = new StackOperationsUsingArrays();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack :: "+stack);
        stackReverse.reverse(stack);
        System.out.println("Reverse Stack :: "+stack);



    }
}
