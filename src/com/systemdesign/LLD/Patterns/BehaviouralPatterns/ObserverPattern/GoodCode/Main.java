package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.GoodCode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //create a publisher
        WeatherStation weatherStation=new WeatherStation();

        //create a subscribers
        Observer observer1=new MobileDevice();
       Observer observer2=new DisplayDevice();

       //make it subscribe publisher
        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);

        weatherStation.updateTemperature(40.3f);
        weatherStation.updateTemperature(42.3f);
        weatherStation.updateTemperature(44.3f);
        weatherStation.updateTemperature(48.3f);
    }
}
