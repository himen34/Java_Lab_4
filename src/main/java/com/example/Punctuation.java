package com.example;

/**
 * The Punctuation class represents a punctuation character in a text.
 */
public class Punctuation {
    private char value;

    /**
     * Constructs a Punctuation with the specified value.
     *
     * @param value the character representing the punctuation
     * @throws IllegalArgumentException if the value is not a valid punctuation character
     */
    public Punctuation(char value) {
        if (!isPunctuation(value)) {
            throw new IllegalArgumentException("Invalid punctuation: " + value);
        }
        this.value = value;
    }

    /**
     * Returns the character value of this Punctuation.
     *
     * @return the character value of this Punctuation
     */
    public char getValue() {
        return value;
    }

    /**
     * Checks if a character is a punctuation mark.
     *
     * @param ch the character to check
     * @return true if the character is a punctuation mark, false otherwise
     */
    public static boolean isPunctuation(char ch) {
        return " ,?!.:;()-".indexOf(ch) != -1; // Valid punctuation characters
    }
}
