package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char currentCharacter;
        boolean isValid = !name.isEmpty() && isLowerLatinLetter(name.charAt(0));
        if (isValid) {
            for (int i = 1; i < name.length(); i++) {
                currentCharacter = name.charAt(i);
                if (!(Character.isDigit(currentCharacter)) && !(isUpperLatinLetter(currentCharacter)) && !(isSpecialSymbol(currentCharacter)) && !(isLowerLatinLetter(currentCharacter))) {
                    isValid = false;
                    break;
                }

            }

        }
        return isValid;
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

