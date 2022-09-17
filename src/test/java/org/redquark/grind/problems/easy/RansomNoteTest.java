package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {

    private final RansomNote ransomNoteObject = new RansomNote();

    @Test
    public void testCanConstruct() {
        String ransomNote = "a";
        String magazine = "b";
        assertFalse(ransomNoteObject.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "ab";
        assertFalse(ransomNoteObject.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "aab";
        assertTrue(ransomNoteObject.canConstruct(ransomNote, magazine));
    }
}