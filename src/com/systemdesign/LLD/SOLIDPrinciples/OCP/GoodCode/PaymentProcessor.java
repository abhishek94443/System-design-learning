package com.systemdesign.LLD.SOLIDPrinciples.OCP.GoodCode;

public class PaymentProcessor {
    public static void processPayment (PaymentMethod paymentMethod,int amount){
        paymentMethod.pay(amount);
    }
}
