package com.example.petshop;

import java.util.Date;

public abstract class Excited extends Mood {
    public Excited() {
        super();
    }

    public Excited(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Excited :D";
    }
}
