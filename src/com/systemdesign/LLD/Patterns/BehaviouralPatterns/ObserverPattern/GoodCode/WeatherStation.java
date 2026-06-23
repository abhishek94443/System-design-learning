package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements DataSource{
    private float temperature;
    List<Observer> observers=new ArrayList<>();

    public float getTemperature() {
        return temperature;
    }

    public void updateTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(this.temperature);
        }

    }
}
