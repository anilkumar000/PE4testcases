package com.StackRoute.PE4;

public class CharacterOccurenceFinder {
    public long findingOccurence(Character charOfOccurenceInString,String inputString){

if (charOfOccurenceInString.equals(' '))
       return inputString.chars().filter(compareChar->compareChar==charOfOccurenceInString).count();
else
    throw new NullPointerException();
    }

}
