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
    public void leapYearTest(int() {
        assertEquals(true, App.leapYearTest(2020));
        assertEquals(false, App.leapYearTest(2016));

    }
}
