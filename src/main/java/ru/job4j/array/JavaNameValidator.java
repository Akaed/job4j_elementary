package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char currentCharacter;
        boolean valide = false;
        if (!(name.isEmpty())) {
            if (isLowerLatinLetter(name.charAt(0))) {
                for (int i = 1; i < name.length(); i++) {
                    currentCharacter = name.charAt(i);
                    if (Character.isDigit(currentCharacter)) {
                        valide = true;
                    }
                    if (isUpperLatinLetter(name.charAt(i))) {
                        valide = true;
                    }
                    if (isLowerLatinLetter(name.charAt(i))) {
                        valide = true;
                    }
                    if (isSpecialSymbol(name.charAt(i))) {
                        valide = true;
                    }
                }
            }
        }
        return valide;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valide = false;
        if (code == 36 || code == 95) {
            valide = true;
        }
        return valide;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valide = false;
            if (code >= 65 && code <= 99) {
                valide = true;
            }
        return valide;
    }

    public static boolean isLowerLatinLetter(int  code) {
        boolean valide = false;
            if (code >= 97 && code <= 122) {
                valide = true;
            }
        return valide;
    }

}

