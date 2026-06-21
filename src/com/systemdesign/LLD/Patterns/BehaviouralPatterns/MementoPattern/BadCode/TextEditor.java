package com.systemdesign.LLD.Patterns.BehaviouralPatterns.MementoPattern.BadCode;


/*
* A editor where user can undo their changes , such a stext addition or
* formmatting the editor should store the snapshot of its state (text content )
* after each change and enabling the user to revert to previous state
* */

public class TextEditor{
   private String content;

    void write (String content){
        this.content=content;
    }
    void  getContent(){
        System.out.println(this.content);
    }
}
 class Main {

    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();
        textEditor.write("Hello");
        textEditor.write("Hello I am Abhishek");
//there is no logic for undo
        textEditor.getContent();

    }
}
