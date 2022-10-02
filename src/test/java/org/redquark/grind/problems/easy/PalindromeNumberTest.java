package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void testIsPalindromeBruteForce() {
        assertTrue(palindromeNumber.isPalindromeBruteForce(121));
        assertFalse(palindromeNumber.isPalindromeBruteForce(-121));
        assertFalse(palindromeNumber.isPalindromeBruteForce(10));
    }

    @Test
    public void testIsPalindromeOptimal() {
        assertTrue(palindromeNumber.isPalindromeOptimal(121));
        assertFalse(palindromeNumber.isPalindromeOptimal(-121));
        assertFalse(palindromeNumber.isPalindromeOptimal(10));
    }
}