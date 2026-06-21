package com.systemdesign.LLD.SOLIDPrinciples.DIP.GoodCode;

public class SMSService implements NotificationService{
    @Override
    public void send() {
        System.out.println("SMS Sent");
    }
}
