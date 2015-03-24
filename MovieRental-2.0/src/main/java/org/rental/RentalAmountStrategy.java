package org.rental;

public class RentalAmountStrategy {

    public double getAmount(Movie movie, int rentalDays) {
        double thisAmount = 0;
        switch (movie.getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (rentalDays > 2)
                    thisAmount += (rentalDays - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += rentalDays * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (rentalDays > 3)
                    thisAmount += (rentalDays - 3) * 1.5;
                break;
        }
        return thisAmount;

    }


}
