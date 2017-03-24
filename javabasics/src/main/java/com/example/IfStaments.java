package com.example;

public class IfStaments {
    public static void main(String[] args) {
        boolean isOn = true;
        String str1 = "test";
        String str2 = "test";

        if (isOn && str1 == str2) {
            isOn = false;
            System.out.print("Turn it off");
        } else {
            System.out.print("Thank you for saving");
        }
    }
}
