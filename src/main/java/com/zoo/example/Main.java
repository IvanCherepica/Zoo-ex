package com.zoo.example;

import com.zoo.example.animals.Crocodile;
import com.zoo.example.animals.Horse;
import com.zoo.example.animals.Turtle;
import com.zoo.example.animals.interfaces.ZooAnimal;
import com.zoo.example.users.Visitor;

public class Main {
    public static void main(String[] args) {
        Visitor bob = new Visitor("Bob", 67);
        Visitor marly = new Visitor("Marly", 13);
        Visitor genry = new Visitor("Genry", 34);

        Crocodile crocodile = new Crocodile(5, 7);
        Horse horse = new Horse(5, 1);
        Turtle turtle = new Turtle(5,8);

        Visitor[] visitors = new Visitor[] {bob, marly, genry};
        ZooAnimal[] animals = new ZooAnimal[] {crocodile, horse, turtle};

        System.out.println("Before visiting the zoo:");
        for (Visitor visitor : visitors) {
            System.out.println("name: " + visitor.getName() + ", cheer: " + visitor.getCheer());
        }
        System.out.println();

        for (ZooAnimal animal : animals) {
            animal.cheerUp(visitors);
        }

        System.out.println("After visiting the zoo:");
        for (Visitor visitor : visitors) {
            System.out.println("name: " + visitor.getName() + ", cheer: " + visitor.getCheer());
        }
    }
}
