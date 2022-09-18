package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {

    private final AddBinary addBinary = new AddBinary();

    @Test
    public void testAddBinary() {
        String a = "11";
        String b = "1";
        assertEquals("100", addBinary.addBinary(a, b));

        a = "1010";
        b = "1011";
        assertEquals("10101", addBinary.addBinary(a, b));
    }
}