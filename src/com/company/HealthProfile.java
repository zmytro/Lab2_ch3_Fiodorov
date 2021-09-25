package com.company;

public class HealthProfile {

    private String first_name;
    private String last_name;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;

    public HealthProfile(String first_name, String last_name, String gender, int day, int month, int year, double height,
                         double weight) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
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

    public String getDateOfBirth() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public String getTargetHeartRate() {
        return String.format("between %s and %s", getMaximumHeartRate() * 0.5, getMaximumHeartRate() * 0.85);
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getGender(){
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;

    }
    public double getBmi() {
        return (double)((weight) / (height * height));
    }
    /**сеттеры*/
    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
