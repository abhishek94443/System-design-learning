package com.systemdesign.LLD.SOLIDPrinciples.LSP.GoodCode;




abstract class Readable  {
    abstract void read();
}
interface Writable  {
    void write();
}
 class ReadableFile extends Readable {
    @Override
    void read() {
        System.out.println("Reading file");
    }
}

class  WritableFile extends Readable implements Writable{

    @Override
    void read() {
        System.out.println("Reading file");
    }

    @Override
    public void write() {
        System.out.println("Writing file");
    }
}


