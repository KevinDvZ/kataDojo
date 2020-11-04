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
        assertEquals("FooFoo", App.fooBarQix(3));
        assertEquals("Bar", App.fooBarQix(5));
        assertEquals("Qix", App.fooBarQix(7));
        assertEquals("4", App.fooBarQix(4));
        assertEquals("FooBarBar", App.fooBarQix(15));
        // assertEquals("FooQix", App.fooBarQix(21));
    }

}
