package com.example;

/**
 * Created by rey on 10/15/16.
 */

public class Functions {
    public static void main(String[] args) {
        helloUser("Rey");
        helloUser("Kid");
        addition(8, 9);
        addition(10,8);
        int total = multiplication(9, 7);
        System.out.println(total);
    }
    public static void helloUser(String user) {
        System.out.println("Hello " + user + "!");
    }

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
}
