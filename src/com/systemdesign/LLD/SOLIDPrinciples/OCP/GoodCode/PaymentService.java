package com.systemdesign.LLD.SOLIDPrinciples.OCP.GoodCode;

public class PaymentService {


    public static void main(String[] args) {
        PaymentMethod creditcard=new CreditCard("122345334434");
        PaymentMethod debitcard=new DebitCard("122345334434");
        PaymentMethod upi=new UPI ("122345334434");

        PaymentProcessor.processPayment(creditcard,120);
        PaymentProcessor.processPayment(debitcard,120);
        PaymentProcessor.processPayment(upi,120);
    }
}
