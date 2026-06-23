package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.BadCode;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation(30);



        Devices device1=new Devices("Mobile");
        Devices device2=new Devices("TV");
        Devices device3=new Devices("Monitor");
        weatherStation.addDevices(device1); //This is tight coupling
        weatherStation.addDevices(device2);
        weatherStation.addDevices(device3);
        weatherStation.changeTemperature(30);

        System.out.println(device1.getTemperature());
        System.out.println(device2.getTemperature());
        System.out.println(device3.getTemperature());

        weatherStation.changeTemperature(40);

        System.out.println(device1.getTemperature());
        System.out.println(device2.getTemperature());
        System.out.println(device3.getTemperature());



    }
}
