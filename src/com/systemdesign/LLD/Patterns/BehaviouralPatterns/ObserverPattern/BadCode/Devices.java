package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.BadCode;

public class Devices {
    private int temperature;
    private String name;
public Devices(String name){
    this.name=name;
}
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
