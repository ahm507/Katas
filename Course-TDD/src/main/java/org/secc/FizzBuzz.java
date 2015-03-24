package org.secc;

public class FizzBuzz {
    public String get(int num) {
        if(num % 3 == 0 && num % 5 == 0)
            return "FizzBuzz";
        if(num % 3 == 0)
            return "Fizz";
        else if(num % 5 == 0)
            return "Buzz";
        else
            return String.format("%d", num);
    }
}
