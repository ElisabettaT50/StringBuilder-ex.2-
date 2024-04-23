package com.example;

public class Main {
    public static void main(String[] args) {

        UnicodeCharacterGetter getter = new UnicodeCharacterGetter("Hello", 1);

        String unicodeCharacter = getter.getUnicodeCharacter();

        System.out.println("Carattere Unicode all'indice specificato: " + unicodeCharacter);
    }
}