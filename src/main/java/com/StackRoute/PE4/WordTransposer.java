package com.StackRoute.PE4;

public class WordTransposer {
    public String transposingWords(String input) {
        if (input.isEmpty() || input.isBlank()) {
            return "Please enter a valid string. Null or empty string given.";
        }
        String[] words = input.split("\\s");
        StringBuilder transposeString = new StringBuilder();
        for (String word : words) {
            transposeString.append(
                    new StringBuilder(word).reverse() + " "
            );
        }
        return transposeString.toString().trim();
    }
}
