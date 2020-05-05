package com.stack;

import java.util.Stack;

public class StackReverseUsingRecursion<E> {

    private static <E> void reverseStack(Stack<E> stack){
        if(stack.isEmpty()){
            return;
        }
        E bottomElement =  popBottom(stack);
        reverseStack(stack);
        stack.push(bottomElement);
    }

    private static <E> E popBottom(Stack<E> stack) {
        E top = stack.pop();
        if(stack.isEmpty()){
            return top;
        } else {
            E bottomElement = popBottom(stack);
            stack.push(top);
            return bottomElement;
        }
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println("Original stack :: "+stack);
        reverseStack(stack);
        System.out.println("Reverse stack :: " +stack);
    }
}
