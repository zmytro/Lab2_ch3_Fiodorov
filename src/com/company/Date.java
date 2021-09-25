package com.company;

public class Date {
    private int month;
    private int day;
    private int year;
/**констукор*/
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(day+"/"+month+"/"+year);
    }
/**геттеры*/

    public int getDay() {
    return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
/**сеттеры*/

    public void setDay(int day) {
        if(day>=0 && day<=31) {
            this.day = day;
        }else this.day = 0;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12) {
            this.month = month;
        }else this.month = 0;

    }
    public void setYear(int year) {
        this.year = year;
    }
}