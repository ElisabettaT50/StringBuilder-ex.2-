package com.example;

public class UnicodeCharacterGetter {
    private String inputString;
    private int index;

    public UnicodeCharacterGetter(String inputString, int index) {
        this.inputString = inputString;
        this.index = index;
    }

    public String getUnicodeCharacter() {
        if (index >= 0 && index < inputString.length()) {
            char character = inputString.charAt(index);
            StringBuilder unicodeBuilder = new StringBuilder();
            unicodeBuilder.append("U+").append(Integer.toHexString(character | 0x10000).substring(1));
            return unicodeBuilder.toString();
        } else {
            return "Errore: Indice non valido.";
        }
    }
}



