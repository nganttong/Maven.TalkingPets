package io.zipcoder.polymorphism;

public class Pet {
        String name;
        String speak;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String speak() {
            return "Can I talk?";
        }
}
