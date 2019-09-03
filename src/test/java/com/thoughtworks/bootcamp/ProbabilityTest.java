package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProbabilityTest {

    @Test
    void givenZeroTrails_whenCheckedProbability_thenShouldReturnTrue(){
        Probability probabilityOfTossingACoin = new Probability(0.5f);
        Probability probabilityOfEvenNumberOnDice=new Probability(0.5f);

        assertTrue(probabilityOfEvenNumberOnDice.equals(probabilityOfTossingACoin));
    }
}
