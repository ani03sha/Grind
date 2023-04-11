package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.grind.problems.medium.ImplementTrie.Trie;

public class ImplementTrieTest {

    private final Trie trie = new Trie();

    @Test
    public void test() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));
        trie.insert("app");
        assertTrue(trie.search("app"));
    }
}