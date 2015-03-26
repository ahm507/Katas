package org.secc;

import java.util.ArrayList;

public class PrimeFactors {

    ArrayList<Integer> primes = new ArrayList<Integer>();

    public ArrayList<Integer> get(int num) {

        primes.clear();
        if(num > 1) {

            for(int factor = 2; num > 1; factor++) {
//                while (divisible(num, factor)) {
                for(; divisible(num, factor) ; num = num/factor) {
                    primes.add(factor);
//                    num /= factor;
                }
            }

        }
        return primes;
    }

    boolean divisible(int num, int divide) {
        return num % divide == 0;
    }



}
