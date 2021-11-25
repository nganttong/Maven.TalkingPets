package io.zipcoder.polymorphism;
import io.zipcoder.polymorphism.pets.Cat;
import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Pony;
import java.util.ArrayList;
import java.util.List;

public class Console {
    List<Pet> listOfPets = new ArrayList<Pet>();
    private static Integer numberOfPets = 0;

    public void run() {
        System.out.println("Hi! How many pets do you have?");
        Integer amountOfPets = InputOutput.numberOfPets();
        while (numberOfPets < amountOfPets) {
            for (int i = 0; i < amountOfPets; i++) {
                numberOfPets++;
                System.out.println("What kind of pet do you have?");
                System.out.println("1. Cat "  + "2. Dog " + "3. Pony");
                switch (InputOutput.chooseThePet()) {
                    case 1 :
                        listOfPets.add(i, new Cat());
                        break;
                    case 2 :
                        listOfPets.add(i, new Dog());
                        break;
                    case 3 :
                        listOfPets.add(i, new Pony());
                        break;
                }
            }
        }
        petName();
        printNamesAndPetType();
    }
    public void petName() {
        System.out.println("What are their names?");
        for (Pet listOfPet : listOfPets) {
            if (listOfPet instanceof Cat) {
                System.out.println("What is your cat's name?");
                listOfPet.setName(InputOutput.namesOfPets());
            } else if (listOfPet instanceof Dog) {
                System.out.println("What is your dog's name?");
                listOfPet.setName(InputOutput.namesOfPets());
            } else {
                System.out.println("What is your pony's name?");
                listOfPet.setName(InputOutput.namesOfPets());
            }
        }
    }
    public void printNamesAndPetType() {
        for (Pet listOfPets : listOfPets) {
            if (listOfPets instanceof Cat) {
                System.out.println("Your cat, " + listOfPets.getName() + " wants to tell you " + listOfPets.speak());
            } else if (listOfPets instanceof Dog) {
                System.out.println("Your dog, " + listOfPets.getName() + " wants to tell you " + listOfPets.speak());
            } else {
                System.out.println("Your pony, " + listOfPets.getName() + " wants to tell you " + listOfPets.speak());
            }
        }
    }
}