package com.example;

/**
 * The Letter class represents a single letter in a text.
 */
public class Letter {
    private char value;

    /**
     * Constructs a Letter with the specified value.
     *
     * @param value the character representing the letter
     * @throws IllegalArgumentException if the value is not a valid letter
     */
    public Letter(char value) {
        if (!isLetter(value)) {
            throw new IllegalArgumentException("Invalid letter: " + value);
        }
        this.value = value;
    }

    /**
     * Returns the character value of this Letter.
     *
     * @return the character value of this Letter
     */
    public char getValue() {
        return value;
    }

    /**
     * Checks if a character is a letter.
     *
     * @param ch the character to check
     * @return true if the character is a letter, false otherwise
     */
    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }
}
