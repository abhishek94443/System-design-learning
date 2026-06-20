package com.systemdesign.LLD.SOLIDPrinciples.SRP.GoodCode;

public class Invoice {
    private double amount ;


    public Invoice(double amount) {
        this.amount = amount;
    }

    //Additional functionality
    public void generateInvoice(){
        System.out.println("Invoice generated and printed for amount "+ amount);
    }



}
