package com.company;
public class HeartRates {
    private String first_name;
    private String last_name;
    private int month;
    private int day;
    private int year;
/**конструктор*/
    public HeartRates(String first_name, String last_name, int month, int day, int year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.month = month;
        this.day = day;
        this.year = year;
    }
/**геттеры*/
public String getFirstName() {
    return first_name;
}

    public String getLastName() {
        return last_name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return 2021 - year;
    }

    public String getTargetHeartRate() {
        return String.format("between %s and %s", getMaximumHeartRate() * 0.5, getMaximumHeartRate() * 0.85);
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

/**сеттеры*/
    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

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
