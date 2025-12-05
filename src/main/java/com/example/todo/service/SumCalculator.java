package com.example.todo.service;

import org.springframework.stereotype.Service;

@Service
public class SumCalculator {
    // Adds two integers and returns their sum.
    public int sum(int a, int b) {
        return a + b;
    }
}

