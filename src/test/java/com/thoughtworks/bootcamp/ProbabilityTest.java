package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {

    @Test
    void givenEqualProbabilityOfTossingCoinAndRollingDice_whenCheckedProbability_thenShouldReturnTrue(){
        Probability probabilityOfTossingACoin = new Probability(0.5f);
        Probability probabilityOfEvenNumberOnDice=new Probability(0.5f);

        assertTrue(probabilityOfTossingACoin.equals(probabilityOfEvenNumberOnDice  ));
    }

    @Test
    void givenUnEqualProbabilityOfTossingCoinAndRollingDice_WhenCheckProbability_thenShouldReturnFalse(){
        Probability probabilityOfTossingACoin = new Probability(0.1f);
        Probability probabilityOfEvenNumberOnDice=new Probability(0.5f);
        assertFalse(probabilityOfTossingACoin.equals(probabilityOfEvenNumberOnDice));
    }

    @Test
    void givenZeroEventsHappened_whenCalculateEventNotHappened_thenShouldReturnOne(){
        Probability events=new Probability(0.0f);
        assertEquals(1.0f,events.eventsNotHappened());
    }
    @Test
    void givenOneEventHappened_whenCalculateEventNotHappened_thenShouldReturnZero(){
        Probability events=new Probability(1.0f);
        assertEquals(0.0f,events.eventsNotHappened());
    }

    @Test
    void givenAFloatNumberBetweenZeroAndOneEventsHappened_whenCalculateEventNotHappened_thenShouldReturnFloatValueBetweenZeroAndOne(){

        Probability events=new Probability(0.15f);
        assertEquals(0.85f,events.eventsNotHappened());
    }

    @Test
    void givenZeroEventsHappened_whenEventsHappenedTogether_thenShouldReturnZero(){
        float zero=0.0f;
        Probability events=new Probability(zero,zero);
        assertEquals(0.0f,events.eventsHappenedTogether());
    }

}
