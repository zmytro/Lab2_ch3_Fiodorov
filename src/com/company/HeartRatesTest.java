package com.company;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates heartrate = new HeartRates("Dmitri", "Fiodorov", 5,25,2000);

        System.out.println(heartrate.getFirstName()+" "+heartrate.getLastName()+" "+heartrate.getAge());
        System.out.println("Maximum heart rate: "+heartrate.getMaximumHeartRate()+" bpm");
        System.out.println("Targe heart rate: "+heartrate.getTargetHeartRate()+" bpm");
    }

}
