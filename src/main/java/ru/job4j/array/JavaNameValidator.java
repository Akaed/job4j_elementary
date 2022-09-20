package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char currentCharacter;
        boolean numberPresent = false;
        isSpecialSymbol(name);
        if (name.isEmpty()) {
            return false;
        }
        isUpperLatinLetter(name);
        isLowerLatinLetter(name);
            for (int i = 0; i < name.length(); i++) {
                currentCharacter = name.charAt(i);
                if (Character.isDigit(currentCharacter)) {
                    numberPresent = true;
                }
            }
        return false;
    }

    public static boolean isSpecialSymbol(String code) {
        boolean valide = false;
        code = "_$";
        Character code1 = code.charAt(2);
        Character code2 = code.charAt(1);
        if (code.equals(code1) || code.equals(code2)) {
            valide = true;
        }
        return valide;
    }

    public static boolean isUpperLatinLetter(String code) {
        boolean valide = false;
        for (int i = 0; i < code.length(); i++) {
            int asci = code.codePointAt(i);
            if (asci >= 65 || asci <= 99) {
                valide = true;
            }
        }
        return valide;
    }

    public static boolean isLowerLatinLetter(String  code) {
        boolean valide = false;
        for (int i = 0; i < code.length(); i++) {
            int asci = code.codePointAt(i);
            if (asci >= 97 || asci <= 122) {
                valide = true;
            }
        }
        return valide;
    }

}

