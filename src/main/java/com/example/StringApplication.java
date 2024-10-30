package com.example;

/**
 * The StringApplication class demonstrates the usage of the TextProcessor class.
 * It processes a given text to sort words starting with vowels and displays the
 * original and processed text.
 */
public class StringApplication {

    /**
     * The main method is the entry point of the application.
     * It initializes the input text, creates a Text object, processes it
     * to sort words starting with vowels, and prints both the original 
     * and sorted texts.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Initialize the input text to be processed
        String inputText = "Apple opera echo ape eagle ultra element object. Words starting with consonants, as well as punctuation, remain the same(oaw).";

        try {
            // Create a Text object with the input text
            Text text = new Text(inputText);
            System.out.println();
            System.out.println("Input text:     " + text.getValue());

            // Create a TextProcessor instance with the Text object
            TextProcessor textProcessor = new TextProcessor(text);

            // Process the text to sort words starting with vowels
            Text sortedText = textProcessor.sortWordsStartingWithVowels();

            // Display the sorted result
            System.out.println("Sorted words:   " + sortedText.getValue());
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.err.println("Input validation error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
