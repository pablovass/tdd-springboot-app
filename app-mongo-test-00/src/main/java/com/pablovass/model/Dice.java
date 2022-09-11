package com.pablovass.model;

import java.util.Random;

public class Dice {
    private  int slides;

    public Dice(int slides) {
        this.slides = slides;
    }

    public  int roll(){
        return new Random().nextInt(slides)+1;
    }
}
