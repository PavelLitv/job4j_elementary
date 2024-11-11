package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when1and3MaxThen3() {
        int a = 1, b = 3;
        int expected = 3;
        assertThat(Max.max(a, b)).isEqualTo(expected);
    }

    @Test
    void when1and8andMinus8MaxThen8() {
        int a = 1, b = 8, c = -8;
        int expected = 8;
        assertThat(Max.max(a, b, c)).isEqualTo(expected);
    }

    @Test
    void when1and8andMinus8and99MaxThen99() {
        int a = 1, b = 8, c = -8, d = 99;
        int expected = 99;
        assertThat(Max.max(a, b, c, d)).isEqualTo(expected);
    }
}