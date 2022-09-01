package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Mark";
        names[1] = "Markus";
        names[2] = "Max";
        names[3] = "Mad";
        for (String name: names) {
            System.out.println(name);
        }
    }

}