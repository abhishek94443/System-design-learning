package com.systemdesign.LLD.SOLIDPrinciples.DIP.GoodCode;

public class EmailService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Email Sent");
    }
}
