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
        assertEquals(false, App.leapYearTest(2017));

    }

    @Test
    void fooBarQix() {
        String = "";
        assertEquals("Foo", App.fooBarQix(3));
        assertEquals("Bar", App.fooBarQix(5));
        assertEquals("Qix", App.fooBarQix(7));
    }

}
