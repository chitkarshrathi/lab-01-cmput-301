package com.example.petshop;

import java.util.Date;

import java.util.ArrayList;


public class Cat extends Pet implements Pettable {
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthdate) {
        super(name, birthdate);
    }
    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    public Void pet() {
        return null;
    }

}
