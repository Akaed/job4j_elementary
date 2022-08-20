package ru.job4j.condition;

import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 0, 7, 0);
        System.out.println("result (2, 0) to (7, 0) " + result);
    }
}
