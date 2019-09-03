package com.thoughtworks.bootcamp;

public class Probability {
    private float probabilityValue;

    Probability(float probability) {
        this.probabilityValue = probability;
    }


    public boolean equals(Object obj) {

        return this.probabilityValue == ((Probability) obj).probabilityValue;
    }

    public float eventsNotHappened() {
        if (probabilityValue==1){
            return  0.0f;
        }
        return 1.0f;
    }
}
