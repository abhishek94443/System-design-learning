package com.systemdesign.LLD.SOLIDPrinciples.OCP.GoodCode;

public class DebitCard implements PaymentMethod {
    private String cardNo;
    public DebitCard(String cardNo){
        this.cardNo=cardNo;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" using Debit card");
    }
}
