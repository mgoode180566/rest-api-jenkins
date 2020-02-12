package com.mgoode.restapijenkins.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements ICalculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
