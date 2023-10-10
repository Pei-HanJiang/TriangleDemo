package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 0, 10);

        try{
            triangle.checkTriangle(triangle.a, triangle.b, triangle.c);
        }catch(Exception e){
            System.out.println("Exception occured: " + e);
        }
    }

}