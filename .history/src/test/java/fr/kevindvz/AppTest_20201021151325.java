package fr.kevindvz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void leapYearTest() {
        assertEquals(true, App.leapYearTest(2020));
        assertEquals(false, App.leapYearTest(2021));

    }
}
