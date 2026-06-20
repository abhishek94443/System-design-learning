package com.systemdesign.LLD.SOLIDPrinciples.OCP.BadCode;

public class PaymentProcessor {

    void pay(String paymentMethod, double amount){
        if(paymentMethod.equalsIgnoreCase("creditcard")){
            //business logic
            System.out.println("Processed Payment using credit card");
        }
        else if(paymentMethod.equalsIgnoreCase("debitcard")){
            //business logic
            System.out.println("Processed Payment using debit card");
        }
        else if(paymentMethod.equalsIgnoreCase("upi")){
            //business logic
            System.out.println("Processed Payment using UPI");
        }
        else{
            System.out.println("unsupported payment type");
        }
    }
}
