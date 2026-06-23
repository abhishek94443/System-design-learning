package com.systemdesign.LLD.Patterns.BehaviouralPatterns.ObserverPattern.GoodCode;

public interface DataSource {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
