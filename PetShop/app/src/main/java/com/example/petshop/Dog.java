package com.example.petshop;

import java.util.Date;

import java.util.ArrayList;


public class Dog extends Pet implements Pettable {
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "bark"; // Cats meow
    }

    public Void pet() {
        return null;
    }

}
