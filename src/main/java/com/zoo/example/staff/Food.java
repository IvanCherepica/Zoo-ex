package com.zoo.example.staff;

public abstract class Food {
    protected int nutritionalValue;

    public Food(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }
}
