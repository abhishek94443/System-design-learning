package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.GoodCode;

public class MobileDevice implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("Temperature on mobile is " +temperature);
    }
}
