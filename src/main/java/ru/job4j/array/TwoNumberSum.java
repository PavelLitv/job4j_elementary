package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int j = 0;
        int i = 1;
        while (j < array.length - 1) {
            if (array[0] + array[1] > target) {
                break;
            }
            if (array[i] + array[j] == target) {
                return new int[]{j, i};
            }
            if (array[i] + array[j] > target || i == array.length - 1) {
                j++;
                i = j;
            }
            i++;
        }

        return new int[0];
    }
}
