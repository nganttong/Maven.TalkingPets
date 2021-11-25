package io.zipcoder.polymorphism.pets;

import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PonyTest {

    @Test
    public void constructorTest() {
        //given
        String expectedName = "Rocco";
        //when
        Pony testPony = new Pony(expectedName);
        String retrievedName = testPony.getName();
        //then
        Assert.assertEquals(expectedName, retrievedName);
    }

    @Test
    public void testGetName() {
        //given
        String expectedName = "Rocco";
        //when
        Pony testPony = new Pony(expectedName);
        String actualName = testPony.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "Neigh";
        //when
        Pony testPony = new Pony("Ricky");
        String actualSpeak = testPony.speak();
        //then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testPetInheritance() {
        Pony testPony = new Pony("Lucy");
        Assert.assertTrue(testPony instanceof Pet);
    }


}