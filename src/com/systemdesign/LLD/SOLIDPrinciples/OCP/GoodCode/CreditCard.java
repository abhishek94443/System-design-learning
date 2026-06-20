package com.systemdesign.LLD.SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod {
    private String cardNo;
    public CreditCard(String cardNo){
        this.cardNo=cardNo;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" using Credit card");
    }
}
