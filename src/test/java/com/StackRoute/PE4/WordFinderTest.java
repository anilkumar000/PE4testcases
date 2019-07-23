package com.StackRoute.PE4;
import org.junit.*;
import static org.junit.Assert.*;

public class WordFinderTest {
    WordFinder wordFinder;

    @Before
    public void setUp() throws Exception {
        wordFinder = new WordFinder();
    }

    @After
    public void tearDown() throws Exception {
        wordFinder = null;
    }

    /**
     * Test - findPattern()
     * Given null, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        wordFinder.findingPattern(null);
    }

    /**
     * Test - findPattern()
     * Given a empty string, method should throw a
     * Runtime Exception.
     */
    @Test(expected = RuntimeException.class)
    public void givenNullCharacterShouldThrowNullPointerException() {
        wordFinder.findingPattern("  ");
    }

    /**
     * Test - findPattern()
     * Check if the method throws RunTimeException when blank string is given.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringsShouldThrowNullPointerExceptions() {
        wordFinder.findingPattern("");
    }

    /**
     * Test - findPattern()
     * When a string containing "harry" is given, the method should return true.
     */
    @Test
    public void givenInputShouldReturnTrue() {
        assertTrue("givenInputShouldReturnTrue: check findPattern(). Should return true.",
                wordFinder.findingPattern("This is harry"));
    }

    /**
     * Test - findPattern()
     * When a string without containing "harry" is given, method should return false.
     */
    @Test
    public void givenStringWithoutHarryShouldReturnFalse() {
        assertFalse("givenStringWithoutHarryShouldReturnFalse: check findPattern(). Should return false.",
                wordFinder.findingPattern("This is Henry?"));
    }

    /**
     * Test - findPattern()
     * Check if the method works when string contains both upper and lower case letters.
     */
    @Test
    public void givenStringWithHarryInUpperCaseShouldReturnTrue() {
        assertTrue("givenStringWithHarryInUpperCaseShouldReturnTrue: check findPattern(). Should return true even for uppercase string.",
                wordFinder.findingPattern("This is Harry."));
    }
}

