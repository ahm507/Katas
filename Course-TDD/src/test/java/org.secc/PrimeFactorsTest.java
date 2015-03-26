package org.secc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)

public class PrimeFactorsTest {

    PrimeFactors prime;

    @Before
    public void setUp() throws Exception {
        prime = new PrimeFactors();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, ""}, {2, "2"}, {3, "3"}, {4, "2, 2"},
                {6, "2, 3"}, {8, "2, 2, 2"}, {9, "3, 3"},
                {12, "2, 2, 3"}, {14, "2, 7"}, {286, "2, 11, 13"}
        });
    }

    private int input;
    private String expected;

    public PrimeFactorsTest(int input, String expected) {
        this.input= input;
        this.expected= expected;
    }

    @Test
    public void test_prime() throws Exception {
        assertEquals(expected, stringfy(prime.get(input)));
    }

    @Test
    public void testStringfy() throws Exception {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(4);
        assertEquals("2, 3, 4", stringfy(primes));
    }

    @Test
    public void testStringfy2() throws Exception {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        assertEquals("2", stringfy(primes));

    }

    public static String stringfy(ArrayList<Integer> arr) {

        StringBuffer out = new StringBuffer();
        for(int i = 0 ; i < arr.size(); i++) {
            out.append(arr.get(i));
            if(i != arr.size()-1) {
                out.append(", ");
            }

        }
        return out.toString();
    }

}

