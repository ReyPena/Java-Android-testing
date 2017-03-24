package com.example;

public class Arrays {
    public static void main(String[] args) {
        String[] dogNames = new String[]{"Fido", "Max", "Loki", "Thor"};
        for (int i=0; i < dogNames.length; i++) {
            System.out.println(dogNames[i]);
        }
        int[] numbersToAdd = new int[]{1,2,3,4,5};

        int total = 0;

        for (int i = 0; i < numbersToAdd.length; i++) {
            total = total + numbersToAdd[i];
        }
        System.out.println(total);
    }
}
