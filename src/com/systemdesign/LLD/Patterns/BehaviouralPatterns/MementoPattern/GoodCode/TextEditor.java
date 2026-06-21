package com.systemdesign.LLD.Patterns.BehaviouralPatterns.MementoPattern.GoodCode;



//originator whose state going to save
public class TextEditor {
    private String content;

    void write (String content){
        this.content=content;
    }
    void  getContent(){
        System.out.println(this.content);
    }

    public Memento save(){
        return new Memento(content);
    }

    public void restore(Memento m){
        content= m.getContent();
    }

}

