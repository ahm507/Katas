package org.secc;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StdDevTest {

    StdDev sigma;

    @Before
    public void setUp() throws Exception {
        sigma = new StdDev();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(18, sigma.sum(new int[]{5, 6, 7}));
    }

    @Test
    public void testAverage() throws Exception {
        assertEquals(6.0, sigma.average(new int[]{5, 6, 7}), 0.00001);
    }

    @Test
    public void testDiffFromAverage() throws Exception {
        assertEquals(2.0, sigma.diffFromAverage(8, new int[]{5, 6, 7}));
    }

    @Test
    public void testSquareOfDiff() throws Exception {
        assertEquals(4.0, sigma.squareOfDiffFromAverage(8, new int[]{5, 6, 7}));
    }

    @Test
    public void testStdDev() throws Exception {
        assertEquals(0.816, sigma.stdDev(new int[]{5, 6, 7}), 0.001);

    }
}
