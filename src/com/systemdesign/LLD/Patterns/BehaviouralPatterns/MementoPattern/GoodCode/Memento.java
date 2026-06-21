package com.systemdesign.LLD.Patterns.BehaviouralPatterns.MementoPattern.GoodCode;


// Memento class : this class stores the state of Text Editor
public class Memento {
    private final String content;

    public Memento(String content){
        this.content=content;
    }

    public String getContent(){
        return this.content;
    }

}
