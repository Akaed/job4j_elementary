package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int left = (array.length) - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp  = array[left];
            array[left] = array[i];
            array[i] = temp;
            left--;
        }
        return array;
    }

}