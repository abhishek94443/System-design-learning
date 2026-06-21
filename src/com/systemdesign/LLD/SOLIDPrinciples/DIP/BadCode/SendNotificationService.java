package com.systemdesign.LLD.SOLIDPrinciples.DIP.BadCode;

public class SendNotificationService {
EmailService emailService=new EmailService();
SMSService smsService=new SMSService();

public void sendEmail(){
    emailService.sendEmail();

}
public void sendSms(){
    smsService.sendSMS();
}
}
