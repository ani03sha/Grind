package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {

    private final WordBreak wordBreak = new WordBreak();

    @Test
    public void testWordBreak() {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        assertTrue(wordBreak.wordBreak(s, wordDict));

        s = "applepenapple";
        wordDict = List.of("apple", "pen");
        assertTrue(wordBreak.wordBreak(s, wordDict));

        s = "catsandog";
        wordDict = List.of("cats", "dog", "sand", "and", "cat");
        assertFalse(wordBreak.wordBreak(s, wordDict));
    }
}