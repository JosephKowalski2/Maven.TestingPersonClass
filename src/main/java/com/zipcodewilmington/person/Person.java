package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String dob;
    private String address;
    private int phonenumber;
    private int numofpets;
    private String email;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String dob, String address, int phonenumber, int numofpets, String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.phonenumber = phonenumber;
        this.numofpets = numofpets;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setNumofpets(int numofpets) {
        this.numofpets = numofpets;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getDob() {
        return this.dob;
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getPhonenumber() {
        return this.phonenumber;
    }

    public Integer getNumofpets() {
        return this.numofpets;
    }

    public String getEmail() {
        return this.email;
    }
}
