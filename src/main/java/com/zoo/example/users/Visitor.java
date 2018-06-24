package com.zoo.example.users;

public class Visitor extends User {

    private int cheer;

    public Visitor(String name, int age) {
        super(name, age);
    }

    public int getCheer() {
        return cheer;
    }

    public void setCheer(int cheer) {
        this.cheer = cheer;
    }

    public void upCheer(int cheer) {
        this.cheer += cheer;
    }
}
