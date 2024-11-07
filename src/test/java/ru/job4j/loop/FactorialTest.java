package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculate7Then5040() {
        int number = 7;
        int expected = 5040;
        int actual = Factorial.calculate(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenCalculate1Then1() {
        int number = 1;
        int expected = 1;
        int actual = Factorial.calculate(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenCalculate0Then1() {
        int number = 0;
        int expected = 1;
        int actual = Factorial.calculate(number);
        assertThat(actual).isEqualTo(expected);
    }
}