package org.rental;


import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    public Customer (String name){
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName (){
        return _name;
    }

    public String statement() {
        Enumeration rentals = _rentals.elements();
        String result = getHeader();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.getAmount();
            result += getMovieDetails(each, thisAmount);
        }
        result += getFooter();
        return result;
    }

    String getFooter() {
        return  "Amount owed is " + String.valueOf(getTotalAmount()) + "\n" +
                 "You earned " + String.valueOf(getTotalFrequentPoints()) +
                " frequent renter points";
    }

    String getMovieDetails(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" +
                String.valueOf(thisAmount) + "\n";
    }

    String getHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    double getTotalAmount() {
        double total = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            total += each.getAmount();
        }
        return total;
    }

    int getTotalFrequentPoints() {
        int totalPoints = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            totalPoints += each.getFrequetPoint();
        }
        return totalPoints;
    }
}
