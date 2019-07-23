package com.StackRoute.PE4;

import  org.junit.*;
import static org.junit.Assert.*;

public class CharacterOccurenceFinderTest {
    CharacterOccurenceFinder characterOccurenceFinder;

    @Before
    public void setUp() throws Exception {
       characterOccurenceFinder =new CharacterOccurenceFinder();
    }

    @After
    public void tearDown() throws Exception {
        characterOccurenceFinder=null;
    }

    @Test
    public void givenCharAndInputStringShouldReturnCountOfOccurrences(){
        String inputString="Java is java again";
        assertEquals(6,characterOccurenceFinder.findingOccurence('a',inputString));
    }

    @Test
    public void givenCharAndStringShouldReturnTrueValue(){
        String inputString="Java is java again";
        assertNotEquals(4,characterOccurenceFinder.findingOccurence('a',inputString));


    }

    @Test(expected = NullPointerException.class)
    public void givenNullCharAndStringShouldReturnNullPointerException(){
        String inputString="Java is java again";
        characterOccurenceFinder.findingOccurence(null,inputString);
//        characterOccurenceFinder.findingOccurence('',inputString);
        characterOccurenceFinder.findingOccurence(' ',inputString);


    }

    @Test(expected = NullPointerException.class)
    public void givenCharAndNullStringShouldReturnNullPointerException(){
        String inputString="Java is java again";
        characterOccurenceFinder.findingOccurence('a',null);

    }

}