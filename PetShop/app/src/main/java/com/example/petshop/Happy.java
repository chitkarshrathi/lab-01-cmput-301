package com.example.petshop;

import java.util.Date;


public abstract class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Happy :)";
    }

}
