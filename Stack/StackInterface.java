package com.stacks;

import java.util.Stack;

public interface StackInterface<Integer> {

    boolean push(int item);
    int pop();
    int peek();
    boolean isEmpty();
    void reverse(Stack<Integer> stack);

}
