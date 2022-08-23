package ru.job4j.loop;

import ru.job4j.condition.SqArea;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = result; index <= n; index++) {
            if (n != 0) {
                result = result * index;
            } else {
                result = 0;
            }

        }
        return result;
    }

}
