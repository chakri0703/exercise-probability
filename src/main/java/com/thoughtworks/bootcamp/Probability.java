package com.thoughtworks.bootcamp;

public class Probability {
    private float value;

    Probability(float probability) {
        this.value = probability;
    }

    public boolean equals(Object obj) {
        return  this.value == ((Probability) obj).value;
    }

    public Probability not() {
        return new Probability(1- value);
    }

    public Probability and( Object obj) {
        return new Probability(((Probability) obj).value * value);
    }

    public Probability or(Probability probabilityOfTossingACoin)
    {
        return  new Probability(value).not().and(new Probability(probabilityOfTossingACoin.value).not()).not();
    }
}
