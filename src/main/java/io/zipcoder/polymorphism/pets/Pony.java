package io.zipcoder.polymorphism.pets;

import io.zipcoder.polymorphism.Pet;

public class Pony extends Pet {
    public Pony(String name) {
        super(name);
    }

    public Pony() {
    }

    public String speak() {
        return "Neigh";
    }
}
