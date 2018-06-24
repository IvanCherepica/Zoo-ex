package com.zoo.example.animals;

import com.zoo.example.animals.abstraction.HerbivoreAnimal;
import com.zoo.example.animals.interfaces.ZooAnimal;
import com.zoo.example.users.Visitor;

public class Horse extends HerbivoreAnimal implements ZooAnimal {
    public Horse(int satiety, int exoticism) {
        super(satiety, exoticism);
    }

    public void getVoice() {
        System.out.println("frr-r-r");
    }

    public void cheerUp(Visitor[] visitors) {
        for (Visitor visitor : visitors) {
            int factor = this.satiety * 100 / visitor.getAge();
            visitor.upCheer(factor);
        }
    }
}
