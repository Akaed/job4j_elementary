package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number != 1) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0 && number != 1 && i != 1) {
                    prime = false;
                    break;
                }
            }
        } else {
            prime = false;
        }
        return prime;
    }

}
