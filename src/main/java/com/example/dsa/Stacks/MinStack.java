package com.example.dsa.Stacks;

import java.util.*;
class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
        System.out.println("=================");
        MinStack minStack2= new MinStack();
        minStack2.push(-2);
        minStack2.push(-1);
        minStack2.push(-2);
        System.out.println(minStack2.getMin()); // return -3
        minStack2.pop();
        System.out.println(minStack2.top());    // return -1
        System.out.println(minStack2.getMin());
        minStack2.pop();
        System.out.println(minStack2.getMin());    // return -1
        minStack2.pop();
    }
    int ptr;
    ArrayList<Integer> data;
    ArrayList<Integer> min;
    public MinStack() {
        data = new ArrayList<>();
        min = new ArrayList<>();
        this.ptr = -1;
    }
    
    public void push(int value) {
        ptr++;
        int m = (ptr==0) ? value : Math.min(min.get(ptr-1), value);
        min.add(m);
        data.add(value);
    }
    
    public void pop() {
        min.remove(ptr);
        data.remove(ptr);
        ptr--;
    }
    
    public int top() {
        return data.get(ptr);
    }
    
    public int getMin() {
        return min.get(ptr);
    }
}
