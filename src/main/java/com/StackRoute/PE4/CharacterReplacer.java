package com.StackRoute.PE4;

public class CharacterReplacer {
    public String replaceCharacter(String inputString){
        if (inputString==null)
            return null;
        else if (inputString.isEmpty() | inputString.isBlank() )
            return "";


        inputString= inputString.replace('d','f').replace('l','t');
        return inputString;
    }
}