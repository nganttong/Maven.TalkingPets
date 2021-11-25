package io.zipcoder.polymorphism.pets;

import io.zipcoder.polymorphism.Pet;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public Cat() {

    }

    @Override
    public String speak() {
        return "Meow";
    }
}
