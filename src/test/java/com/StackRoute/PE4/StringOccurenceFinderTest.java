package com.StackRoute.PE4;
import org.junit.*;
import static org.junit.Assert.*;

public class StringOccurenceFinderTest {
    StringOccurenceFinder stringOccurenceFinder;

    @Before
    public void setUp() throws Exception {
        stringOccurenceFinder = new StringOccurenceFinder();
    }

    @After
    public void tearDown() throws Exception {
        stringOccurenceFinder = null;
    }

    /**
     * Test - getOccurrencePositions()
     * Given null, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullArgumentsShouldThrowNullPointerException() {
        stringOccurenceFinder.getOccurrencePositions(null,null);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        stringOccurenceFinder.getOccurrencePositions(null,"se");
    }

    @Test(expected = NullPointerException.class)
    public void givenNullSearchPatternShouldThrowNullPointerException() {
        stringOccurenceFinder.getOccurrencePositions("Some string search example.", null);
    }

    /**
     * Test - getOccurrencePositions()
     * Given a empty string, method should throw a
     * Runtime Exception.
     */
    @Test(expected = RuntimeException.class)
    public void givenBlankSearchPatternShouldThrowNullPointerException() {
        stringOccurenceFinder.getOccurrencePositions("String to search", "  ");
    }

    @Test(expected = RuntimeException.class)
    public void givenBlankStringShouldThrowNullPointerException() {
        stringOccurenceFinder.getOccurrencePositions("  ", "se");
    }

    /**
     * Test - getOccurrencePositions()
     * Check if the method throws RunTimeException when blank string is given.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldThrowNullPointerExceptions() {
        stringOccurenceFinder.getOccurrencePositions("", "Se");
    }

    @Test(expected = RuntimeException.class)
    public void givenEmptyPatternShouldThrowNullPointerExceptions() {
        stringOccurenceFinder.getOccurrencePositions("String to search.", "");
    }

    /**
     * Test - getOccurrencePositions
     * Check if the method return an array of strings with each string containing
     * the beginning and the end of each occurrence.
     */
    @Test
    public void givenStringAndPatternShouldReturnStringArray() {
        String[] exptectedResult = {
                "4-6",
                "10-12",
                "27-29"
        };
        assertArrayEquals("givenStringAndPatternShouldReturnStringArray: Should return an array containing first and end positions of the substring where the match occurred.",
                exptectedResult, stringOccurenceFinder.getOccurrencePositions("She sells seashells by the seashore", "se"));
    }

    /**
     * Test - getOccurrencePositions
     * Given a string and a pattern that is not present in the string, the
     * method should return null.
     */
    @Test
    public void givenStringAndWrongPatternShouldReturnNull() {
        assertNull("givenStringAndWrongPatternShouldReturnNull: getOccurrencePositions() should return null",
                stringOccurenceFinder.getOccurrencePositions("She sells seashells by the seashore", "de"));
    }


}