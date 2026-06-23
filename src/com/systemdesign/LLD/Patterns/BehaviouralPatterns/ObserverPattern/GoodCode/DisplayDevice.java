package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.GoodCode;


public class DisplayDevice implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("Temperature on Display Device is " +temperature);
    }
}
