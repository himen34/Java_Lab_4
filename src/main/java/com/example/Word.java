package com.example;

/**
 * The Word class represents a word made up of letters.
 * It provides methods to construct a word from a string, 
 * retrieve the string value of the word, and obtain its length.
 */
public class Word {
    private Letter[] letters;

    /**
     * Constructs a Word object from the specified string.
     *
     * @param word the string representation of the word
     * @throws IllegalArgumentException if the word is null, empty, or contains invalid characters
     */
    public Word(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty.");
        }

        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!Letter.isLetter(currentChar)) { // Ensure only valid letters are added
                throw new IllegalArgumentException("Invalid character in word: " + currentChar);
            }
            letters[i] = new Letter(currentChar);
        }
    }

    /**
     * Retrieves the string representation of the word.
     *
     * @return the string value of the word
     */
    public String getValue() {
        StringBuilder wordValue = new StringBuilder();
        for (Letter letter : letters) {
            wordValue.append(letter.getValue());
        }
        return wordValue.toString();
    }

    /**
     * Returns the length of the word.
     *
     * @return the number of letters in the word
     */
    public int length() {
        return letters.length; // Returns the number of letters in the word
    }
}
