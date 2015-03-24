package org.secc;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PrimeFactorsTest {

    PrimeFactors prime;

    @Before
    public void setUp() throws Exception {
        prime = new PrimeFactors();
    }

    ArrayList<Integer> getArray(int[] ints) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int num : ints) {
            array.add(num);
        }
        return array;
    }

    @Test
    public void testPrimeFactors_1() throws Exception {
        assertEquals(getArray(new int[]{}), prime.get(1));
    }

    @Test
    public void testPrimeFactors_2() throws Exception {
        assertEquals(getArray(new int[]{2}), prime.get(2));
    }

    @Test
    public void testPrimeFactors_3() throws Exception {
        assertEquals(getArray(new int[]{3}), prime.get(3));
    }

    @Test
    public void testPrimeFactors_4() throws Exception {
        assertEquals(getArray(new int[]{2, 2}), prime.get(4));
    }

    @Test
    public void test_5() throws Exception {
        assertEquals(getArray(new int[]{5}), prime.get(5));
        assertEquals(getArray(new int[]{2, 3}), prime.get(6));
    }

    @Test
    public void test_8() throws Exception {
        assertEquals(getArray(new int[]{2, 2, 2}), prime.get(8));

    }

    @Test
    public void test_9() throws Exception {
        assertEquals(getArray(new int[]{3, 3}), prime.get(9));

    }

    @Test
    public void test_10() throws Exception {
        assertEquals(getArray(new int[]{2, 5}), prime.get(10));
        assertEquals(getArray(new int[]{2, 2, 3}), prime.get(12));
    }

    @Test
    public void test_14() throws Exception {
        assertEquals(getArray(new int[]{2, 7}), prime.get(14));
    }

    @Test
    public void test_286() throws Exception {
        assertEquals(getArray(new int[]{2, 11, 13}), prime.get(286));
    }


}
