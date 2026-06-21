package com.systemdesign.LLD.SOLIDPrinciples.DIP.GoodCode;

public class SendNotificationService {
    NotificationService notificationService;

    public SendNotificationService(NotificationService notificationService){
        this.notificationService=notificationService;
    }

    public void send(){
        notificationService.send();
    }
}
