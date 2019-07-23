package com.StackRoute.PE4;
import org.junit.*;
import static org.junit.Assert.*;

public class WordSorterTest {

    WordSorter wordSorter;
    @Before
    public void setUp() throws Exception {
        wordSorter = new WordSorter();
    }

    @After
    public void tearDown() throws Exception {
        wordSorter = null;
    }

    /**

     * Given null string to count occurrences, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        wordSorter.sortingWords(null);
    }

    /**

     * Given a Empty string, method should throw a Null Pointer Exception.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldThrowNullPointerException() {
        wordSorter.sortingWords("");
    }

    /**

     * Check if the method throws NullPointerException when blank strings are given.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringsShouldThrowNullPointerExceptions() {
        wordSorter.sortingWords("   ");
    }

    /**
     * Given a string input, the method should return an array of strings sorted
     * alphabetically.
     */
    @Test
    public void givenInputShouldReturnArrayOfSortedWords() {
        String[] expectedOutput = {
                "a",
                "Hello",
                "is",
                "test.",
                "This",
                "world."
        };

        assertArrayEquals("givenInputShouldReturnArrayOfSortedWords: check sortWordsInParagraph(). Should return an array of sorted words.",
                expectedOutput, wordSorter.sortingWords("Hello world. This is a test."));
    }

}