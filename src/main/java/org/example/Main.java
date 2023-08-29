package org.example;

public class Main {
    public static void main(String[] args) {

        String name = "Neo";
        int age = 20;
        float weight = 60.5F;
        boolean employed = false;

        if(employed == true) {
            System.out.println("Hi, my name is " + name + ". I am " + age + " years old and I weigh " + weight + " kgs. At the moment, I am employed");
        }

        else {
            System.out.println("Hi, my name is " + name + ". I am " + age + "years old and I weigh " + weight + ". At the moment, I am unemployed");
        }
    }
}