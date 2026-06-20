package com.systemdesign.LLD.SOLIDPrinciples.SRP.BadCode;

public class Invoice {
    private double amount ;


    public Invoice(double amount) {
        this.amount = amount;
    }

    //Additional functionality
    public void generateInvoice(){
        System.out.println("Invoice generated and printed for amount "+ amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving to database");
    }

    public void sendEmailNotification(){
        System.out.println("Sending Email Notification");
    }
}
