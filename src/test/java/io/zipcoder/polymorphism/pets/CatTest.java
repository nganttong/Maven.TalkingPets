package io.zipcoder.polymorphism.pets;

import io.zipcoder.polymorphism.Pet;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void constructorTest() {
        //given
        String expectedName = "Luna";
        //when
        Cat testCat = new Cat(expectedName);
        String retrievedName = testCat.getName();
        //then
        Assert.assertEquals(expectedName, retrievedName);
    }

    @Test
    public void testGetName() {
        //given
        String expectedName = "Luna";
        //when
        Cat testCat = new Cat(expectedName);
        String actualName = testCat.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "Meow";
        //when
        Cat testCat = new Cat("Sol");
        String actualSpeak = testCat.speak();
        //then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testPetInheritance() {
        Cat testCat = new Cat("Baam");
        Assert.assertTrue(testCat instanceof Pet);
    }
}