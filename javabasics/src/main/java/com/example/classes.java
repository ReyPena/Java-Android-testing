package com.example;

public class classes {
    public static void main(String[] args) {
        Dog myPup = new Dog();
        myPup.name = "Loki";
        myPup.age = 2;
        myPup.furColor = "Grey";

        Husky antoherPup = new Husky();
        antoherPup.furAmount = 5.8;

        myPup.tellMeAboutTheDog();
        antoherPup.telleMeAboutFur();

    }
}

class Dog {
    String name = "";
    int age = 0;
    String furColor = "";
    String breed = "";

    void tellMeAboutTheDog() {
        System.out.println("The Dog's name is " + name + ", it is " + age + " years old");
    }
}

class Husky extends Dog {
    double furAmount = 0.0;

    void telleMeAboutFur() {
        System.out.println("The amount of fur is " + furAmount);
    }
}