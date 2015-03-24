package org.secc;

import static java.lang.Math.sqrt;

public class StdDev {


    public double average(int[] ints) {
        return sum(ints) / ints.length;
    }

    public int sum(int[] ints) {
        int sum = 0;
        for(int num : ints) sum += num;
        return sum;
    }

    public double diffFromAverage(int num, int[] ints) {
        return num - average(ints);
    }

    public double squareOfDiffFromAverage(int num, int[] ints) {
        return diffFromAverage(num, ints) * diffFromAverage(num, ints);
    }

    public double stdDev(int[] ints) {
        double sum = 0;
        for(int num : ints) {
            sum += squareOfDiffFromAverage(num, ints);
        }

        return sqrt(sum / ints.length);

    }
}
