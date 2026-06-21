package com.systemdesign.LLD.Patterns.BehaviouralPatterns.MementoPattern.GoodCode;

import java.util.Stack;

//caretaker : managing state (saving snapshot of text editor state )
public class CareTaker {
   private final  Stack<Memento> history=new Stack<>();


   public void saveState(TextEditor textEditor){
       history.push(textEditor.save());
   }

   public void undo(TextEditor editor){
           if(!history.isEmpty()){
              editor.restore(history.pop());
           }


   }

}
