package org.secc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"}, {2, "2"}, {3, "Fizz"}, {6, "Fizz"}, {5, "Buzz"}, {15, "FizzBuzz"}
        });
    }

    private int fInput;
    private String fExpected;

    public FizzBuzzTest(int input, String expected) {
        fInput= input;
        fExpected= expected;
    }

    FizzBuzz fizbuzz;

    @Before
    public void setUp() throws Exception {
        fizbuzz = new FizzBuzz();
    }

    @Test
    public void testFizz() throws Exception {
        assertEquals(fExpected, fizbuzz.get(fInput));
    }

}
