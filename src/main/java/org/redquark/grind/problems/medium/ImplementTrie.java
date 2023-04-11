package org.redquark.grind.problems.medium;

public class ImplementTrie {

    static class Trie {

        private final TrieNode root;

        Trie() {
            this.root = new TrieNode('\u0000');
        }

        public void insert(String word) {
            // Check if the word is already in the trie
            if (search(word)) {
                return;
            }
            // Reference to the root node
            TrieNode current = root;
            // Traverse through the word
            for (char c : word.toCharArray()) {
                // If the current character node is not null
                if (current.children[c - 'a'] == null) {
                    TrieNode node = new TrieNode(c);
                    current.children[c - 'a'] = node;
                }
                current = current.children[c - 'a'];
            }
            // At the end of the word, we should mark this node as leaf
            current.isLeaf = true;
        }

        public boolean search(String word) {
            // Reference to the root node
            TrieNode current = root;
            // Traverse through the string
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return false;
                }
                current = current.children[c - 'a'];
            }
            return current.isLeaf;
        }

        public boolean startsWith(String prefix) {
            // Check if the word is already present
            if (search(prefix)) {
                return true;
            }
            // Reference node to the root
            TrieNode current = root;
            // Traverse through the prefix
            for (char c : prefix.toCharArray()) {
                // If the current character is not present, it cannot be a prefix
                if (current.children[c - 'a'] == null) {
                    return false;
                }
                current = current.children[c - 'a'];
            }
            return true;
        }

        static class TrieNode {
            final char data;
            final TrieNode[] children;
            boolean isLeaf;

            TrieNode(char data) {
                this.data = data;
                this.children = new TrieNode[26];
            }
        }
    }
}
