package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] arrays) {
        int result = 0;
        for (int[] array : arrays) {
            for (int item : array) {
                result += item;
            }
        }
        return result;
    }
}
