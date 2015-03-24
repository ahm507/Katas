package org.secc;

public class LeapYear {

    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeap() {

//        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
//            return true;
//        return false;


        if ((divisibleBy(4) && ! divisibleBy(100)) ||
//             divisibleBy(4) && divisibleBy(100) && divisibleBy(400)) {
                divisibleBy(400)) {

            return true;
        }

        return false;

//        if (divisibleBy(4)) {
//            if(divisibleBy(100)) {
//                if(divisibleBy(400)) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//            return true;
//        } else {
//            return false;
//        }
    }

    boolean divisibleBy(int num) {
        return year % num == 0;
    }

}
