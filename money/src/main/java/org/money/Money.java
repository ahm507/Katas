package org.money;

public class Money {

    private int pounds;
    private int cents;

    public int getPounds() {
        return pounds;
    }

    public int getCents() {
        return cents;
    }

    public Money(int pounds, int cents) {
        this.pounds = pounds;
        this.cents = cents;
        assert(cents < 100);
    }

    public boolean equals(Money money) {
        return (money.cents == cents && money.pounds == pounds);
    }

    public static Money sum(Money money1, Money money2) {
        if (money1.cents + money2.cents >= 100) {
            return new Money(money1.pounds + money2.pounds + 1,
                    money1.cents + money2.cents - 100);
        } else {
            return new Money(money1.pounds + money2.pounds,
                    money1.cents + money2.cents);
        }
    }

    public static Money sub(Money money1, Money money2) {
        if(money2.cents > money1.cents) {
            return new Money(money1.pounds - money2.pounds -1 , money1.cents - money2.cents + 100);
        } else {
            return new Money(money1.pounds - money2.pounds, money1.cents - money2.cents);
        }
    }
}
