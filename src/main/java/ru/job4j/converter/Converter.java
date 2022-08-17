package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float in2 = 120;
        float out = Converter.rubleToEuro(in);
        float out1 = Converter.rubleToDollar(in2);
        boolean passed = expected == out;
        boolean passed2 = expected == out1;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. Test result : " + passed2);

    }
}