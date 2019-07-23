package com.StackRoute.PE4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordSorter {
    public static String[] sortingWords(String inputString) {
        if (inputString.isEmpty() || inputString.isBlank()) {
            throw new NullPointerException("Empty or Blank string given");
        }
        List<String> list = Arrays.asList(inputString.split(" "));

        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        return list.toArray(new String[list.size()]);
}
}
