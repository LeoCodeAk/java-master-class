package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println(x);
        System.out.println(y);

        int temp = x; //temp = 10
        x = y; // x = 10
        y = temp; // y = 10

        System.out.println(x);
        System.out.println(y);
    }
}