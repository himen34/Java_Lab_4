# Lab Work 4: Relationships Between Classes in the Java Programming Language

This lab work focuses on class relationships through text manipulation and processing using custom classes in Java. 

The lab work is done for Variant № 24.

## Features
- Manages a collection of sentences and processes them for various manipulations, using custom classes such as `Letter`, `Punctuation`, `Word`, `Sentence`, `Text` and  `TextProcessor`.
- Sorts words starting with vowels by their second letter while preserving the original order of other words and punctuation.
- Validates that the input text contains only valid characters and punctuation.
- Utilizes a `StringBuilder` for efficient string operations.

The `TextProcessor` produces an output text that retains the original position of words starting with consonants and punctuation, while rearranging only the order of words that start with vowels. The total number of words remains unchanged.

## Usage
1. Clone the repository.
2. Navigate to the project directory.
3. Compile and run the `TextApplication` file.
4. Modify the input text in the `TextApplication` file as needed, then save the file, recompile, and run again to see the sorted words output in the console.

### 1. Clone the repository:

```bash
git clone https://github.com/himen34/Java_Lab_4.git
cd Java_Lab_4
```

### 2. Build the project (this will also run unit tests):

```bash
mvn package
```

### 3. Run the project:

```bash
mvn clean compile exec:java
```

### 4. Run unit tests:

```bash
mvn test
```

## Requirements

- Java 17 or higher
- Maven 3.6.0 or higher

