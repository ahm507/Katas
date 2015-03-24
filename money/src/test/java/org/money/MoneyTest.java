package org.money;

import org.junit.Test;

public class MoneyTest {

    public void assertEquals(Money money1, Money money2) {
        boolean equals = money1.equals(money2);
        if(equals == false) {
            throw new AssertionError(String.format(
                    "Expected=%d.%d; Actual=%d.%d",
                    money1.getPounds(), money1.getCents(),
                    money2.getPounds(), money2.getCents()));
        }
    }

    @Test
    public void testEquality () {
        Money money1 = new Money(12, 25);
        assertEquals(money1, money1);
    }

    @Test
    public void testSum() {
        Money money1 = new Money(12, 25);
        Money money2 = new Money(12, 25);
        Money money3 = Money.sum(money1, money2);
        assertEquals(new Money(24, 50), money3);
    }

    @Test
    public void testSumOverflow() {
        Money money1 = new Money(12, 25);
        Money money2 = new Money(12, 99);
        Money money3 = Money.sum(money1, money2);
        assertEquals(new Money(25, 24), money3);
    }

    @Test
    public void testSub() {
        Money money1 = new Money(12, 25);
        Money money2 = new Money(2, 20);
        Money money3 = Money.sub(money1, money2);
        assertEquals(new Money(10, 5), money3);
    }

    @Test
    public void testSubWithOverflow() {
        Money money1 = new Money(12, 25);
        Money money2 = new Money(2, 30);
        Money money3 = Money.sub(money1, money2);
        assertEquals(new Money(9, 95), money3);
    }

}