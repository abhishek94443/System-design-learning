package com.systemdesign.LLD.SOLIDPrinciples.DIP.GoodCode;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService=new EmailService();
        NotificationService smsService=new SMSService();

        SendNotificationService sendNotificationServiceViaSMS=new SendNotificationService(smsService);
        sendNotificationServiceViaSMS.send();

        SendNotificationService sendNotificationServiceViaEmail=new SendNotificationService(emailService);
        sendNotificationServiceViaEmail.send();

//        for example new functionality came whatsapp so we only create new WhatsappService class
//        and extend Notification servece nothing else will change
       WhatsappService whatsappService=new WhatsappService();
        SendNotificationService sendNotificationServiceViaWhatsapp=new SendNotificationService(whatsappService);
        sendNotificationServiceViaWhatsapp.send();

    }
}
