package org.example;

public class TriangleException extends Exception {
    public TriangleException(int a, int b, int c) {
        super("Invalid triangle sides: a=" + a + ", b=" + b + ", c=" + c);
    }
}