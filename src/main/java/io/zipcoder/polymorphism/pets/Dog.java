package io.zipcoder.polymorphism.pets;

import io.zipcoder.polymorphism.Pet;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    public String speak() {
        return "Bark";
    }
}
