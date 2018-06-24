package com.zoo.example.animals.abstraction;

import com.zoo.example.staff.Meat;

public abstract class PredatoryAnimal extends Animal {
    public PredatoryAnimal(int satiety, int exoticism) {
        super(satiety, exoticism);
    }

    public void feed(Meat meat) {
        this.satiety++;
    }
}
