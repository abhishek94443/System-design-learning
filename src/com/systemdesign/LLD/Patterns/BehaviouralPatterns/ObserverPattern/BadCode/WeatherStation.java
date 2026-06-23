package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.BadCode;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private int temperature;
    private List<Devices> devices;

    public WeatherStation(int temperature) {
        this.devices=new ArrayList<>();
        this.temperature = temperature;
    }

    public void notifyDevices() {
        for (Devices d:devices) {
            d.setTemperature(this.temperature);
        }
    }

    public void addDevices(Devices devices) {
        this.devices.add(devices);
    }
    public void removeDevices(Devices device) {
        for (Devices d:devices) {
            if(device==d){
                devices.remove(d);
            }
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void changeTemperature(int temperature) {
        this.temperature = temperature;
        notifyDevices();
    }
}
