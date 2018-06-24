package com.zoo.example.animals.abstraction;

import com.zoo.example.staff.Grass;

public abstract class HerbivoreAnimal extends Animal {
    public HerbivoreAnimal(int satiety, int exoticism) {
        super(satiety, exoticism);
    }

    public void feed(Grass grass) {
        this.satiety++;
    }
}
