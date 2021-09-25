package com.company;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date(27, 3, 2000);

        date.displayDate();

        date.setDay(32);
        date.setMonth(13);
        date.setYear(2019);

        date.displayDate();
    }
}
