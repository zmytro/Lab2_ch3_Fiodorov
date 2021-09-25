package com.company;

public class HealthProfileTest {

    public static void main(String[] args) {
        HealthProfile healthProfile = new HealthProfile("Dmitri", "Fiodorov", "Male", 25, 5, 2000, 1.76, 85.1);

        System.out.println("First name: " + healthProfile.getFirstName());

        System.out.println("Last name: "+ healthProfile.getLastName());
        System.out.println("Gender: " + healthProfile.getGender());
        System.out.println("Date of Birth: " + healthProfile.getDateOfBirth());
        System.out.println("Age: " + healthProfile.getAge());
        System.out.println("Height: " + healthProfile.getHeight());
        System.out.println("Weight: " + healthProfile.getWeight());
        //System.out.printf("BMI: %.2f%n" , healthProfile.getBmi());
        if(healthProfile.getBmi()<=18.5)
            System.out.printf("BMI index - %.2f - Underweight %n",healthProfile.getBmi());
        if(healthProfile.getBmi()>=18.5&&healthProfile.getBmi()<=24.9)
            System.out.printf("BMI index - %.2f - Normal %n",healthProfile.getBmi());
        if(healthProfile.getBmi()>=25&&healthProfile.getBmi()<=29.9)
            System.out.printf("BMI index - %.2f - Overweight %n",healthProfile.getBmi());
        if(healthProfile.getBmi()>=30)
            System.out.printf("BMI index - %.2f - Obese %n",healthProfile.getBmi());

        System.out.println("Maximum Heart Rate: " + healthProfile.getMaximumHeartRate());
        System.out.println("Target Heart Rate: " + healthProfile.getTargetHeartRate());
    }

}

