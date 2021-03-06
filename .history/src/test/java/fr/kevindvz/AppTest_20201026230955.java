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
        assertEquals("BarBar", App.fooBarQix(5));
        assertEquals("Foo", App.fooBarQix(6));
        assertEquals("QixQix", App.fooBarQix(7));
        assertEquals("4", App.fooBarQix(4));
        assertEquals("FooBarBar", App.fooBarQix(15));
        assertEquals("FooQix", App.fooBarQix(21));
        assertEquals("FooFooFoo", App.fooBarQix(33));
        assertEquals("BarFoo", App.fooBarQix(53));
        assertEquals("FooBarQix*Bar", App.fooBarQix(105));
        assertEquals("FooQix**", App.fooBarQix(10101));

    }

    @Test
    void numberToText() {
        assertEquals("zero", App.numberToText(0));
        assertEquals("three", App.numberToText(3));
        assertEquals("thirteen", App.numberToText(13));
        assertEquals("twenty-three", App.numberToText(23));
        assertEquals("twenty-six", App.numberToText(26));
        assertEquals("one hundred and seventy-five", App.numberToText(175));
        assertEquals("six hundred and sixty-six", App.numberToText(666));
        assertEquals("one thousand nine hundred and ninety-nine", App.numberToText(1999));
        assertEquals("three hundred and forty-five thousand seven hundred and eighty-nine", App.numberToText(345789));
        assertEquals(
                "one billion two hundred and thirty-four million five hundred and sixty-seven thousand eight hundred and ninety",
                App.numberToText(1234567890));
                assertEquals("two hundred and ninety-three quadrillion four hundred and ninety-three trillion two hundred and eighty-four billion nine hundred and thirty-two million eight hundred and forty-nine thousand two hundred and forty-eight", App.numberToText(293493284932849248))

    }

}
