package com.systemdesign.LLD.SOLIDPrinciples.OCP.GoodCode;

public class UPI implements PaymentMethod{
    private String UPIId;
    public UPI(String UPIId){
        this.UPIId=UPIId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" using UPI");
    }
}
