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
    public void leapYearTest() {
        assertEquals(true, App.leapYearTest(2020));
        assertEquals(true, App.leapYearTest(2016));

    }
}
