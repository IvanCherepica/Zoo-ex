package com.zoo.example.animals.abstraction;

public abstract class Animal {
    protected int satiety;

    protected int exoticism;

    public Animal(int satiety, int exoticism) {
        this.satiety = satiety;
        this.exoticism = exoticism;
    }

    public abstract void getVoice();
}
