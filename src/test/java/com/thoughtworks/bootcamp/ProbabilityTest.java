package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {

    private Probability probabilityOfTossingACoin;
    private Probability probabilityOfEvenNumberOnDice;
    private Probability certain;
    private Probability impossible;

    @BeforeEach
    void setUp() {
        probabilityOfTossingACoin = new Probability(0.5f);
        probabilityOfEvenNumberOnDice = new Probability(0.1f);
        certain = new Probability(1.0f);
        impossible = new Probability(0.0f);
    }

    @Test
    void givenEqualProbabilityOfTossingCoinAndRollingDice_whenCheckedProbability_thenShouldReturnTrue() {
        probabilityOfTossingACoin = new Probability(0.1f);
        assertTrue(probabilityOfTossingACoin.equals(probabilityOfEvenNumberOnDice));
    }

    @Test
    void givenUnEqualProbabilityOfTossingCoinAndRollingDice_WhenCheckProbability_thenShouldReturnFalse() {
        probabilityOfTossingACoin = new Probability(0.17f);
        assertFalse(probabilityOfTossingACoin.equals(probabilityOfEvenNumberOnDice));
    }

    @Test
    void givenZeroEventsHappened_whenCalculateEventNotHappened_thenShouldReturnOne() {
        assertEquals(new Probability(1.0f), impossible.not());
    }

    @Test
    void givenOneEventHappened_whenCalculateEventNotHappened_thenShouldReturnZero() {
        assertEquals(new Probability(0.0f), certain.not());
    }

    @Test
    void givenAFloatNumberBetweenZeroAndOneEventsHappened_whenCalculateEventNotHappened_thenShouldReturnFloatValueBetweenZeroAndOne() {
        assertEquals(new Probability(0.9f), probabilityOfEvenNumberOnDice.not());
    }

    @Test
    void givenBothZeroEventsHappened_whenEventsHappenedTogether_thenShouldReturnZero() {
        assertEquals(new Probability(0.0f) ,impossible.and(impossible));
    }
    @Test
    void givenBothOneEventsHappened_whenEventsHappenedTogether_thenShouldReturnOne() {
        assertEquals(new Probability(1.0f),certain.and(certain));
    }
    @Test
    void givenBothEventsHappenedBetweenZeroAndOne_whenEventsHappenedTogether_whenShouldReturnValueBetweenZeroAndOne() {
        assertEquals(new Probability(0.05f),probabilityOfTossingACoin.and(probabilityOfEvenNumberOnDice));
    }
    @Test
    void givenBothEventsImpossible_whenOr_thenShouldReturnOne(){
    assertEquals(impossible,impossible.or(impossible));
    }
    @Test
    void givenBothEventsCertain_whenOr_thenShouldReturnZero(){
        assertEquals(certain,certain.or(certain));
    }
    @Test
    void givenImpossibleAndCertainEvents_whenOr_thenShouldReturnOne(){
        assertEquals(certain,impossible.or(certain));
    }
    @Test
    void givenBothValuesBetweenZeroAndOne_whenOr_thenShouldReturnValueBetweenZeroAndOne(){
        probabilityOfTossingACoin=new Probability(0.5f);
        probabilityOfEvenNumberOnDice=new Probability(0.5f);
        assertEquals(new Probability(0.75f),probabilityOfTossingACoin.or(probabilityOfEvenNumberOnDice));
    }
}
