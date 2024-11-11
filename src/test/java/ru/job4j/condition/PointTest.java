package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints38And1820Then19dot2093() {
        Point one = new Point(3, 8);
        Point two = new Point(18, 20);
        double expected = 19.209;
        double actual = one.distance(two);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenPointsMinus180And03Then18dot2482() {
        Point one = new Point(-18, 0);
        Point two = new Point(0, 3);
        double expected = 18.248;
        double actual = one.distance(two);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenPoints00And00Then00() {
        Point one = new Point(0, 0);
        Point two = new Point(0, 0);
        double expected = 0;
        double actual = one.distance(two);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when3DPoints000And356Then00() {
        Point one = new Point(0, 0, 0);
        Point two = new Point(3, 4, 6);
        double expected = 7.810;
        double actual = one.distance3d(two);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when3DPoints193AndMinus878Then010() {
        Point one = new Point(1, 9, 3);
        Point two = new Point(-8, 7, 8);
        double expected = 10.488;
        double actual = one.distance3d(two);
        assertThat(actual).isEqualTo(expected, withPrecision(0.001));
    }
}