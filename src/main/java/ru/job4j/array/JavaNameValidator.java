package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char currentCharacter;
        boolean valide = false;
            for (int i = 0; i < name.length(); i++) {
                currentCharacter = name.charAt(i);
                if (Character.isDigit(currentCharacter)) {
                    valide = true;
                }
                if (!(Character.isUpperCase(currentCharacter)) && i == 0 && isLowerLatinLetter(name)) {
                    valide = true;
                }
                if (isSpecialSymbol(name)) {
                    valide = true;
                }
                if (isUpperLatinLetter(name)) {
                    valide = true;
                }
            }

        if (name.isEmpty()) {
            valide = false;
        }
        return valide;
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

