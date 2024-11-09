package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int j = 0;
        int i = array.length - 1;
        while (j != i) {
            if (array[i] + array[j] == target) {
                return new int[]{j, i};
            }
            if (array[i] + array[j] > target) {
                i--;
            } else {
                j++;
            }
        }

        return new int[0];
    }
}
