package io.zipcoder.polymorphism.pets;

import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void constructorTest() {
        //given
        String expectedName = "Rocco";
        //when
        Dog testDog = new Dog(expectedName);
        String retrievedName = testDog.getName();
        //then
        Assert.assertEquals(expectedName, retrievedName);
    }

    @Test
    public void testGetName() {
        //given
        String expectedName = "Rocco";
        //when
        Dog testDog = new Dog(expectedName);
        String actualName = testDog.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "Bark";
        //when
        Dog testDog = new Dog("Ricky");
        String actualSpeak = testDog.speak();
        //then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testPetInheritance() {
        Dog testDog = new Dog("Lucy");
        Assert.assertTrue(testDog instanceof Pet);
    }

}