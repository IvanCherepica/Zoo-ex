package com.zoo.example.animals;

import com.zoo.example.animals.abstraction.PredatoryAnimal;

public class GuardDog extends PredatoryAnimal {
    public GuardDog(int satiety, int exoticism) {
        super(satiety, exoticism);
    }

    public void getVoice() {
        System.out.println("bark!");
    }
}
