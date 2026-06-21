package com.systemdesign.LLD.SOLIDPrinciples.ISP.GoodCode;

public class HumanWorker implements Eat,Work{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}
