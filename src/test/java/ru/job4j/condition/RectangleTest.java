package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength3dot3AndWidth5ThenDiagonal5dot99() {
        double length = 3.3;
        double width = 5;
        double expected = 5.99;
        double actual = Rectangle.diagonal(length, width);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength10AndWidth5dot99ThenDiagonal11dot66() {
        double length = 10;
        double width = 5.99;
        double expected = 11.66;
        double actual = Rectangle.diagonal(length, width);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }
}
