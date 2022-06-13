package com.company;
import java.util.Scanner;

public class Calculator {
    public int result(int a, int b, String op) throws DivisionByZero {
        if ("+".equals(op)) {
            return a + b;
        } else if ("-".equals(op)) {
            return a - b;
        } else if ("/".equals(op)) {
            if (b == 0) {
                throw new DivisionByZero();
            }
            return a / b;
        } else if ("*".equals(op)) {
            return a * b;
        }
        return a;
    }
}
