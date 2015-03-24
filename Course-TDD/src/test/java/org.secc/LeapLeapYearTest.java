package org.secc;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeapLeapYearTest {

    @Test
    public void testIsLeap() {

        assertEquals(true, new LeapYear(1996).isLeap());
        assertEquals(true, new LeapYear(2000).isLeap());
    }

    @Test
    public void testInNotLeap() {
        assertEquals(false, new LeapYear(2001).isLeap());
    }

    @ Test
    public void testIsNotLeap2() {
        assertEquals(false, new LeapYear(1900).isLeap());
    }


}
