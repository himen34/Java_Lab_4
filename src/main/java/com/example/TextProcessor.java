package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The TextProcessor class processes a Text object, specifically sorting words
 * that start with vowels based on their second letter.
 */
public class TextProcessor {
    private Text text;

    /**
     * Constructs a TextProcessor with the given text.
     *
     * @param text the text to be processed
     * @throws IllegalArgumentException if the text is null
     */
    public TextProcessor(Text text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null.");
        }
        this.text = text;
    }

    /**
     * Sorts words in the text that start with vowels based on their second letter.
     *
     * @return a Text object containing the text with sorted vowel words
     */
    public Text sortWordsStartingWithVowels() {
        List<Word> vowelWords = new ArrayList<>();

        // Collect words starting with vowels
        for (Sentence sentence : text.getSentences()) {
            for (Object element : sentence.getElements()) {
                if (element instanceof Word) {
                    Word word = (Word) element;
                    if (isVowel(word.getValue().charAt(0))) {
                        vowelWords.add(word);
                    }
                }
            }
        }

        // Sort the collected vowel words by their second letter
        Collections.sort(vowelWords, (o1, o2) -> {
            if (o1.length() < 2 && o2.length() < 2) return 0;
            if (o1.length() < 2) return 1;
            if (o2.length() < 2) return -1;
            return Character.compare(o1.getValue().charAt(1), o2.getValue().charAt(1));
        });

        // Replace sorted words in the original text
        int vowelIndex = 0;
        Sentence[] sentences = text.getSentences();

        for (Sentence sentence : sentences) {
            for (int i = 0; i < sentence.getElements().size(); i++) {
                Object element = sentence.getElements().get(i);
                if (element instanceof Word) {
                    Word word = (Word) element;
                    if (isVowel(word.getValue().charAt(0)) && vowelIndex < vowelWords.size()) {
                        sentence.getElements().set(i, vowelWords.get(vowelIndex++));
                    }
                }
            }
        }

        return new Text(sentences);
    }

    /**
     * Checks if a character is a vowel.
     *
     * @param ch the character to be checked
     * @return true if the character is a vowel, false otherwise
     */
    private boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
}
