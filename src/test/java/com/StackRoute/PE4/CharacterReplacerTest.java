package com.StackRoute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplacerTest {
private CharacterReplacer characterReplacer;
    @Before
    public void setUp() throws Exception {
       characterReplacer =new CharacterReplacer();
    }

    @After
    public void tearDown() throws Exception {
        characterReplacer=null;
    }
    @Test
    public void givenStringShouldReturnReplacedString() {
        String expectedResult="faity fry";
        String inputString="daily dry";
        assertEquals(expectedResult,characterReplacer.replaceCharacter(inputString));
    }

    @Test
    public void givenStringShouldNotReturnWrongString() {
        String inputString="daily dry";
        assertNotEquals("ccsdc",characterReplacer.replaceCharacter(inputString));
    }

    @Test
    public void givenNullInputShouldReturnNull() {
        assertNull(characterReplacer.replaceCharacter(null));
    }

    @Test
    public void givenEmptyOrBlankInputShouldReturnEmptyString() {
        assertEquals("",characterReplacer.replaceCharacter(""));
    }
}