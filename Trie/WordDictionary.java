package com.lakshmi.java.LogOperations;
import java.util.*;

/**
 * Design Word Dictionary using Trie Data Structure
 * Add words and Search words (Search can be a literal word or a regular expression)
 */
class TrieNode {
    Map<Character, TrieNode> children = new HashMap();
    boolean word = false;
    public TrieNode() {}
}

class WordDictionary {
    TrieNode trie;

    public WordDictionary() {
        trie = new TrieNode();
    }

    // Add a word into your dictionary
    public void addWord(String word) {
        TrieNode node = trie;

        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                node.children.put(ch, new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.word = true;
    }

    // Returns true if the word is in the dictionary
    public boolean searchInNode(String word, TrieNode node) {
        for (int i = 0; i < word.length(); ++i) {
            char ch = word.charAt(i);
            if (!node.children.containsKey(ch)) {
                // if the current character is '.'
                // check all possible nodes at this level
                if (ch == '.') {
                    for (char x : node.children.keySet()) {
                        TrieNode child = node.children.get(x);
                        if (searchInNode(word.substring(i + 1), child)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                // if the character is found
                // go down to the next level in trie
                node = node.children.get(ch);
            }
        }
        return node.word;
    }

    public boolean search(String word) {
        return searchInNode(word, trie);
    }

    public static void main(String... args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("antman");
        System.out.println(wordDictionary.search("man"));
        wordDictionary.addWord("cookie");
        System.out.println(wordDictionary.search(".ookie"));
    }
}