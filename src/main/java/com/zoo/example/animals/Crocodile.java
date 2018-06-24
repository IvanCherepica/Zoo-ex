package com.zoo.example.animals;

import com.zoo.example.animals.abstraction.PredatoryAnimal;
import com.zoo.example.animals.interfaces.DangerAnimal;
import com.zoo.example.animals.interfaces.ZooAnimal;
import com.zoo.example.users.User;
import com.zoo.example.users.Visitor;

public class Crocodile extends PredatoryAnimal implements ZooAnimal, DangerAnimal {

    public Crocodile(int satiety, int exoticism) {
        super(satiety, exoticism);
    }

    public void getVoice() {
        System.out.println("rrr-r-r");
    }

    public void eatPeople(User[] users) {
        for (User user : users) {
            user = null;
        }
    }

    public void cheerUp(Visitor[] visitors) {
        for (Visitor visitor : visitors) {
            int factor = (this.exoticism + this.satiety) * 100 / visitor.getAge();
            visitor.upCheer(factor);
        }
    }
}
