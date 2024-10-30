package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The Sentence class represents a sentence, consisting of words and punctuation.
 */
public class Sentence {
    private List<Object> elements; // Holds Word and Punctuation objects

    /**
     * Constructs a Sentence object from the specified string.
     *
     * @param sentence the string representation of the sentence
     * @throws IllegalArgumentException if the sentence is null or empty
     */
    public Sentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException("Sentence cannot be null or empty.");
        }

        elements = parseSentence(sentence);
    }

    /**
     * Parses the sentence into words and punctuation, preserving their order.
     *
     * @param sentence the sentence to parse
     * @return a list of words and punctuation elements
     */
    private List<Object> parseSentence(String sentence) {
        List<Object> elements = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                currentWord.append(ch);
            } else {
                if (currentWord.length() > 0) {
                    elements.add(new Word(currentWord.toString()));
                    currentWord.setLength(0);
                }
                if (Punctuation.isPunctuation(ch)) {
                    elements.add(new Punctuation(ch));
                }
            }
        }

        if (currentWord.length() > 0) {
            elements.add(new Word(currentWord.toString()));
        }

        return elements;
    }

    /**
     * Returns the words and punctuation elements in this sentence.
     *
     * @return a list of words and punctuation elements
     */
    public List<Object> getElements() {
        return elements;
    }

    /**
     * Retrieves the string representation of the entire sentence.
     *
     * @return the sentence as a string
     */
    public String getValue() {
        StringBuilder sentenceValue = new StringBuilder();
        for (Object element : elements) {
            if (element instanceof Word) {
                sentenceValue.append(((Word) element).getValue());
            } else if (element instanceof Punctuation) {
                sentenceValue.append(((Punctuation) element).getValue());
            }
        }
        return sentenceValue.toString();
    }
}
