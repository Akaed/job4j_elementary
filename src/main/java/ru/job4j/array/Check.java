package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (!data[i]) {
                result = false;
                j++;
            }
            if (j == 3) {
                result = true;
            }
        }
        return result;
    }
}
