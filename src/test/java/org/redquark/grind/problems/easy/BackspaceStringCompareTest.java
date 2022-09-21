package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackspaceStringCompareTest {

    private final BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    public void testBackspaceCompareBruteForce() {
        String s = "ab#c";
        String t = "ad#c";
        assertTrue(backspaceStringCompare.backspaceCompareBruteForce(s, t));

        s = "ab##";
        t = "c#d#";
        assertTrue(backspaceStringCompare.backspaceCompareBruteForce(s, t));

        s = "a#c";
        t = "b";
        assertFalse(backspaceStringCompare.backspaceCompareBruteForce(s, t));
    }

    @Test
    public void testBackspaceCompareOptimal() {
        String s = "ab#c";
        String t = "ad#c";
        assertTrue(backspaceStringCompare.backspaceCompareOptimal(s, t));

        s = "ab##";
        t = "c#d#";
        assertTrue(backspaceStringCompare.backspaceCompareOptimal(s, t));

        s = "a#c";
        t = "b";
        assertFalse(backspaceStringCompare.backspaceCompareOptimal(s, t));
    }
}