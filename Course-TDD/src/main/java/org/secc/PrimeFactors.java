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
//
//            int factor = 2;
//            while (divisible(num, factor)) {
//                primes.add(factor);
//                num /= factor;
//            }
//
//            factor = 3;
//            while (divisible(num, factor)) {
//                primes.add(factor);
//                num /= factor;
//            }
//            factor = 5;
//            while (divisible(num, factor)) {
//                primes.add(factor);
//                num /= factor;
//            }
//
//            factor = 7;
//            while (divisible(num, factor)) {
//                primes.add(factor);
//                num /= factor;
//            }

            if(num > 1)
                primes.add(num);
        }
        return primes;
    }

    boolean divisible(int num, int divide) {
        return num % divide == 0;
    }



}
