package ru.job4j.condition;

public class Vector {
    public static String sumVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;

        return String.format("(%d, %d)", xResult, yResult);
    }

    public static void main(String[] args) {
        System.out.println(Vector.sumVectors(10, 3, 2, 15));
    }
}
