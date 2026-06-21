package com.systemdesign.LLD.SOLIDPrinciples.ISP.BadCode;

interface Worker{
    public void eat();
   public void work();
}

class HumanWorker implements Worker{

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}

class RobotWorker implements Worker{

    @Override
    public void eat() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}