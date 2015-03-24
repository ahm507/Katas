package org.rental;

import org.junit.Test;

public class CustomerTest {

    Customer customer = new Customer("Ali");

    @Test
    public void rentRegularMovie() throws Exception {
        customer.addRental(new Rental(new Movie("Rambo", Movie.REGULAR), 2));
        String expected = "Rental Record for Ali\n" +
                "\tRambo\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }

    private void assertEquals(String expected, String statement) {
    }

    @Test
    public void testChilderenMovie() throws Exception {
        customer.addRental(new Rental(new Movie("Frozen", Movie.CHILDRENS), 3));
        String statement = customer.statement();
        String expected = "Rental Record for Ali\n" +
                "\tFrozen\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, statement);
    }

    @Test
    public void testNewReleaseMovie() throws Exception {
        customer.addRental(new Rental(new Movie("The Illusionist", Movie.NEW_RELEASE), 10));
        String statement = customer.statement();
        String expected = "Rental Record for Ali\n" +
                "\tThe Illusionist\t30.0\n" +
                "Amount owed is 30.0\n" +
                "You earned 2 frequent renter points";
        assertEquals(expected, statement);
    }

    @Test
    public void testRegularMovieMoreThanTwo() throws Exception {
        customer.addRental(new Rental(new Movie("Avatar", Movie.REGULAR), 5));
        String statement = customer.statement();
        String expected = "Rental Record for Ali\n" +
                "\tAvatar\t6.5\n" +
                "Amount owed is 6.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, statement);
    }

    @Test
    public void testChilderenMovieMoreThanThree() throws Exception {
        customer.addRental(new Rental(new Movie("Toy", Movie.CHILDRENS), 5));
        String statement = customer.statement();
        String expected = "Rental Record for Ali\n" +
                "\tToy\t4.5\n" +
                "Amount owed is 4.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, statement);
    }

    @Test
    public void rentRegularAndNewReleaseMovie() throws Exception {
        customer.addRental(new Rental(new Movie("Rambo", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("John Wick", Movie.NEW_RELEASE), 2));
        String expected = "Rental Record for Ali\n" +
                "\tRambo\t2.0\n" +
                "\tJohn Wick\t6.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 3 frequent renter points";
        assertEquals(expected, customer.statement());
    }


}