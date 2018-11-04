/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author sergio
 */
public class Nodo {
    
    
    
   private Object value;
    private Nodo next;
    private Nodo previous;

    public Nodo(Object value) {
        this.value = value;
        next= null;
        previous = null;
    }
    public Nodo (Object value, Nodo next, Nodo previous) {
    	this.value = value;
        this.next= next;
        this.previous = previous;
    }
    
    public Object getValue(){
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Nodo getNextElement() {
        return next;
    }
    
    public void setNextElement(Nodo nextElement) {
        this.next = nextElement;
    }
    public Nodo getPreviousElement() {
        return previous;
    }

    public void setPreviousElement(Nodo previousElement) {
        this.previous = previousElement;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", nextElement=" + ((next != null) ? next.getValue()
                : null) + ", previousElement=" +( (previous != null) ? previous.getValue() : null) + "]";
    }
    
    
}


