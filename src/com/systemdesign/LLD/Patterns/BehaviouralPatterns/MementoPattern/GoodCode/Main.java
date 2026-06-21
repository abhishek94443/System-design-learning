package com.systemdesign.LLD.Patterns.BehaviouralPatterns.MementoPattern.GoodCode;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();
        CareTaker careTaker=new CareTaker();

        textEditor.write("hii");
        careTaker.saveState(textEditor);

        textEditor.write("hello");
        careTaker.saveState(textEditor);

        textEditor.getContent();
        careTaker.undo(textEditor);
        careTaker.undo(textEditor);
        textEditor.getContent();



    }
}
