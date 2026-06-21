package com.systemdesign.LLD.SOLIDPrinciples.ISP.GoodCode;

public class RobotWorker implements Work {
    @Override
    public void work() {
        System.out.println("Working");
    }
}
