package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints38And1820Then19dot2093() {
        int x1 = 3, y1 = 8, x2 = 18, y2 = 20;
        double expected = 19.209;
        double actual = Point.distance(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenPointsMinus180And03Then18dot2482() {
        int x1 = -18, y1 = 0, x2 = 0, y2 = 3;
        double expected = 18.248;
        double actual = Point.distance(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenPoints00And00Then00() {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double expected = 0;
        double actual = Point.distance(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }
}