package com.csmithswim.company;

public class Die {
    public int numberOfSides;
    public int value;

    public Die() {
        numberOfSides = 6;
    }

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void roll() {
        value = (int) ((Math.random() * numberOfSides) + 1);
    }

}