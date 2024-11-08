package ru.job4j.loop;

public class Factorial {
    static int calculate(int number) {
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
