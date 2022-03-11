/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainstack;

import java.util.ArrayList;

/**
 *
 * @author leeca
 */
public class TrainStack implements StackInterface{
    
    private ArrayList<String> theStack;
    
    public TrainStack () {
        theStack = new ArrayList<>();
    }
    
    @Override
    public Boolean isEmpty() {
       return theStack.isEmpty(); // will return true or false
    }

    @Override
    public Boolean isFull() { //stack cannot be full - arrayList size 
        return false;
    }
    
    @Override
    public void push(Object newItem) {// add elements to top of stack
        theStack.add(0,(String) newItem); //type and what to add
    }

    @Override
    public Object pop() {
        if(!theStack.isEmpty()){
            return theStack.remove(0);
        }
        else{
            return null;
        }
    }

    @Override
    public int size() {
        return theStack.size();
    }

    @Override
    public void emptyStack() {
       while(!theStack.isEmpty()){
           pop();
       }
    }

    @Override
    public String displayStack(){
        String str = new String();
        if(theStack.isEmpty()){
            str = str.concat("EMPTY");
        }
        else{
            for(int i=0; i<theStack.size(); i++){
                str = str.concat(theStack.get(i));
                str = str.concat(";");
             }
        }
        
        return str;
    } //display stack end;
    
}
