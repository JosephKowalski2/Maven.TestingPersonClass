package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllDetails() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedDob = "08/18/1990";
        String expectedAddress = "123 Something Lane";
        Integer expectedPhonenumber = 1112223333;
        Integer expectedNumofpets = 2;
        String expectedEmail = "something@zipcode.com";

        // When
        Person person = new Person(expectedName, expectedAge, expectedDob, expectedAddress,expectedPhonenumber,
                expectedNumofpets, expectedEmail);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualDob = person.getDob();
        String actualAddress = person.getAddress();
        Integer actualPhonenumber = person.getPhonenumber();
        Integer actualNumofpets = person.getNumofpets();
        String actualEmail = person.getEmail();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDob, actualDob);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedPhonenumber, actualPhonenumber);
        Assert.assertEquals(expectedNumofpets, actualNumofpets);
        Assert.assertEquals(expectedEmail, actualEmail);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
}
