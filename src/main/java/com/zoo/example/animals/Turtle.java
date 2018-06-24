package com.zoo.example.animals;

import com.zoo.example.animals.abstraction.HerbivoreAnimal;
import com.zoo.example.animals.interfaces.ZooAnimal;
import com.zoo.example.users.Visitor;

public class Turtle extends HerbivoreAnimal implements ZooAnimal {
    public Turtle(int satiety, int exoticism) {
        super(satiety, exoticism);
    }

    public void getVoice() {}

    public void cheerUp(Visitor[] visitors) {
        for (Visitor visitor : visitors) {
            int factor = this.exoticism * 100 / visitor.getAge();
            visitor.upCheer(factor);
        }
    }
}
