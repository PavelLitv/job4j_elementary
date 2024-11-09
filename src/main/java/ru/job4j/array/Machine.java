package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int changeHandling = money - price;
        for (int coin : coins) {
            while (changeHandling >= coin) {
                result[size] = coin;
                size++;
                changeHandling -= coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
