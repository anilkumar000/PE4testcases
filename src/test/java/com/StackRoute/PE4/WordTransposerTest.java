package com.StackRoute.PE4;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTransposerTest {

    WordTransposer wordTransposer;

    @Before
    public void setUp() throws Exception {
        wordTransposer = new WordTransposer();
    }

    @After
    public void tearDown() throws Exception {
        wordTransposer = null;
    }

    /**
     * Test - transposeWordsInString()
     * Given empty string as input, check if the method return an error message or not.
     */
    @Test
    public void givenEmptyStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check transposeWordsInStrings()",
                expectedMessage, wordTransposer.transposingWords(""));
    }

    /**
     * Test - transposeWordsInString()
     * Given blank string as input, check if the method return an error message or not.
     */
    @Test
    public void givenBlankStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check transposeWordsInStrings()",
                expectedMessage, wordTransposer.transposingWords("  "));
    }

    /**
     * Test - transposeWordsInString()
     * Should return transpose of the given string.
     */
    @Test
    public void givenStringShouldReturnTranspose() {
        String expectedResult = "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals("givenStringShouldReturnTranspose: check transposeWordsInString(). Should return reverse of the string",
                expectedResult, wordTransposer.transposingWords("a quick brown fox jumps over the lazy dog"));
    }

}