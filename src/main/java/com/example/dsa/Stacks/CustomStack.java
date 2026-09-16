package com.example.dsa.Stacks;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;

    private CustomStack() {
        this(DEFAULT_SIZE);
    }

    private CustomStack(int size) {
        this.data = new int[size];
    }
}
