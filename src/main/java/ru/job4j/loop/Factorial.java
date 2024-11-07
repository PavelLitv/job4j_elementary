package ru.job4j.loop;

public class Factorial {
    static int calculate(int number) {
        int fact = 1;
        if (number < 2) {
            return fact;
        }
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
