package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void testIsAnagramBruteForce() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagramBruteForce(s, t));

        s = "rat";
        t = "car";
        assertFalse(validAnagram.isAnagramBruteForce(s, t));
    }

    @Test
    public void testIsAnagramOptimal() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagramOptimal(s, t));

        s = "rat";
        t = "car";
        assertFalse(validAnagram.isAnagramOptimal(s, t));
    }
}