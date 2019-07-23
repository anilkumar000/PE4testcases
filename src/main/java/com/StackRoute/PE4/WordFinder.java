package com.StackRoute.PE4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {
    public boolean findingPattern(String stringToMatch) {
        if (stringToMatch.isBlank() || stringToMatch.isEmpty()) {
            throw new RuntimeException();
        }
        Pattern pattern = Pattern.compile("(\\s?)(?i)harry\\1");
        Matcher matcher = pattern.matcher(stringToMatch);
        return matcher.find();
    }
}
