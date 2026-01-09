package com.example.petshop;

import java.util.Date;

public abstract class Sad extends Mood {
    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Sad :(";
    }
}
