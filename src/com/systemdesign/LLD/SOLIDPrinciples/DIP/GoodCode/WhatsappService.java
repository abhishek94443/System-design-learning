package com.systemdesign.LLD.SOLIDPrinciples.DIP.GoodCode;

public class WhatsappService implements NotificationService{
    @Override
    public void send() {
        System.out.println("Sent Through Whatsapp");
    }
}
