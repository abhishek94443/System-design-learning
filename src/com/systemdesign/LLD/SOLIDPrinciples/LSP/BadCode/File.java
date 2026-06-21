package com.systemdesign.LLD.SOLIDPrinciples.LSP.BadCode;

public abstract class File {
    abstract void readfile();
    abstract void writeFile();
}

class WritableFile extends File{

    @Override
    void readfile() {
        System.out.println("Reading file");
    }

    @Override
    void writeFile() {
        System.out.println("Writing file");
    }
}

class ReadableFile extends File{

    @Override
    void readfile() {
        System.out.println("reading file");
    }

    @Override
    void writeFile() {
        System.out.println("write not supported");

    }
}
