package org.secc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TennisTest {

    @Test
    public void test_1_0() {
        assertEquals("Fifteen - Love", Tennis.score(1, 0));
    }

    @Test
    public void test_0_1() {
        assertEquals("Love - Fifteen", Tennis.score(0, 1));
    }

    @Test
    public void test_1_1() {
        assertEquals("Fifteen All", Tennis.score(1, 1));
    }

    @Test
    public void test_2_1() {
        assertEquals("Thirty - Fifteen", Tennis.score(2, 1));
    }

    @Test
    public void test_1_2() {
        assertEquals("Fifteen - Thirty", Tennis.score(1, 2));
    }

    @Test
    public void test_2_2() {
        assertEquals("Thirty All", Tennis.score(2, 2));
    }

    @Test
    public void test_3_1() {
        assertEquals("Forty - Fifteen", Tennis.score(3, 1));
        assertEquals("Fifteen - Forty", Tennis.score(1, 3));
        assertEquals("Deuce", Tennis.score(3, 3));
    }

    @Test
    public void test_4_1() {
        assertEquals("Game, player1", Tennis.score(4, 1));
        assertEquals("Game, player2", Tennis.score(1, 4));
    }

    @Test
    public void test_2_3() {
        assertEquals("Thirty - Forty", Tennis.score(2, 3));
        assertEquals("Forty - Thirty", Tennis.score(3, 2));
        assertEquals("Deuce", Tennis.score(3, 3));
    }

    @Test
    public void test_4_3() {
        assertEquals("Advantage, player1", Tennis.score(4, 3));
        assertEquals("Advantage, player2", Tennis.score(3, 4));
    }

    @Test
    public void test_4_4() {
        assertEquals("Deuce", Tennis.score(4, 4));
    }

    @Test
    public void test_5_4() {
        assertEquals("Advantage, player1", Tennis.score(5, 4));
    }

    @Test
    public void test_6_4() {
        assertEquals("Game, player1", Tennis.score(6, 4));
        assertEquals("Game, player2", Tennis.score(4, 6));

    }


}
