package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void testIsValidOptimal() {
        String s = "()";
        assertTrue(validParentheses.isValid(s));

        s = "()[]{}";
        assertTrue(validParentheses.isValid(s));

        s = "(]";
        assertFalse(validParentheses.isValid(s));
    }
}