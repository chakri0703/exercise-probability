package com.thoughtworks.bootcamp;

public class Probability {
    private float probabilityValue;
    private float probabilityValueTwo;

    Probability(float probability) {
        this.probabilityValue = probability;
    }

    Probability(float probabilityValue,float probabilityValue1){
        this.probabilityValue=probabilityValue;
        this.probabilityValueTwo =probabilityValue1;
    }

    public boolean equals(Object obj) {

        return this.probabilityValue == ((Probability) obj).probabilityValue;
    }

    public float eventsNotHappened() {
       return 1-probabilityValue;
    }

    public float eventsHappenedTogether() {

        return (float)(probabilityValueTwo *probabilityValue);
    }
}
