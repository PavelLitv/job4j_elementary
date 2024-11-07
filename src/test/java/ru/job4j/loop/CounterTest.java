package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumFrom0To15Then120() {
        int start = 0, finish = 15;
        int expected = 120;
        int actual = Counter.sum(start, finish);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumFrom10To5Then0() {
        int start = 10, finish = 5;
        int expected = 0;
        int actual = Counter.sum(start, finish);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumFromMinus10To5ThenMinus40() {
        int start = -10, finish = 5;
        int expected = -40;
        int actual = Counter.sum(start, finish);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int actual = Counter.sumByEven(start, finish);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10To10Then0() {
        int start = -10;
        int finish = 10;
        int expected = 0;
        int actual = Counter.sumByEven(start, finish);
        assertThat(actual).isEqualTo(expected);
    }
}
