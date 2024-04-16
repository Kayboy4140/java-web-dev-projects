package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets must return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets in front of other characters return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"), message);
    }

    @Test
    public void singleBracketAroundOtherCharacters() {
        String message = "balanced brackets around other characters return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"), message);
    }

    @Test
    public void singleBracketsBetweenOtherCharacters() {
        String message = "balanced brackets between other characters return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"), message);
    }

    @Test
    public void tripleBalancedBrackets() {
        String message = "three consecutive pairs of balanced brackets return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"), message);
    }

    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "three nested pairs of balanced brackets return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"), message);
    }

    @Test
    public void singleOpeningBracket() {
        String message = "a single opening bracket returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("["), message);
    }

    @Test
    public void singleClosingBracket() {
        String message = "a single closing bracket returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"), message);
    }

    @Test
    public void reversedBrackets() {
        String message = "a set of reversed brackets returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["), message);
    }

    @Test
    public void singleBracketWithOtherCharacters() {
        String message = "a single opening bracket with other characters returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"), message);
    }

    @Test
    public void unbalancedBracketsBetweenOtherCharacters() {
        String message = "unbalanced brackets between other characters returns false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["), message);
    }

    @Test
    public void mixOfUnbalancedBrackets() {
        String message = "mix of unbalanced brackets return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]][]"), message);
    }

    @Test
    public void emptyString() {
        String message = "an empty string returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets(""), message);
    }
}