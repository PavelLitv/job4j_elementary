package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void whenVectors38AndMinus85ThenResultMinus5Plus3() {
        int x1 = 3, y1 = 8, x2 = -8, y2 = -5;
        String expected = "(-5, 3)";
        String actual = Vector.sumVectors(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus85AndMinus30ThenResultMinus115() {
        int x1 = -8, y1 = -5, x2 = -3, y2 = 0;
        String expected = "(-11, -5)";
        String actual = Vector.sumVectors(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenVectors00And36ThenResult36() {
        int x1 = 0, y1 = 0, x2 = 3, y2 = 6;
        String expected = "(3, 6)";
        String actual = Vector.sumVectors(x1, y1, x2, y2);
        assertThat(actual).isEqualTo(expected);
    }
}