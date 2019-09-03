package com.thoughtworks.bootcamp;

public class Probability {
    private float probabilityValue;
    private float probabilityValue1;
    Probability(float probability) {
        this.probabilityValue = probability;
    }

    Probability(float probabilityValue,float probabilityValue1){
        this.probabilityValue=probabilityValue;
        this.probabilityValue1=probabilityValue1;
    }

    public boolean equals(Object obj) {

        return this.probabilityValue == ((Probability) obj).probabilityValue;
    }

    public float eventsNotHappened() {
       return 1-probabilityValue;
    }

    public float eventsHappenedTogether() {

        return (float)(probabilityValue1*probabilityValue);
    }
}
