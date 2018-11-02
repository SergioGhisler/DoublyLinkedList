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
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     * @return
     */
    private int size = 0;
    private Nodo head;
    private Nodo tail;

    public boolean empty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public boolean insert(int pos, Object obj) {
        if (pos==0){
            pushHead(obj);
            return true;
        }
        else if(pos==size-1){
            pushTail(obj);
            return true;
        }else if (pos<size-1 && pos>0) {
        	Nodo temp = head;
        for(int i = 0; i<pos-1;i++) 
        	temp = temp.getNextElement();
        
        temp.setNextElement(new Nodo(obj,temp.getNextElement(),temp));
        	size++;
        	return true;
        }
        	return false;
    }

    public void pushHead(Object obj) {
        Nodo nodo = new Nodo(obj);
        if (empty() == true) {
            tail = nodo;
            head = nodo;
            size++;
        } else {
            nodo.setNextElement(head);
            head.setPreviousElement(nodo);
            head = nodo;
            size++;
        }
    }

    public void pushTail(Object obj) {
        Nodo nodo = new Nodo(obj);
        if (empty() == true) {
            tail = nodo;
            head = nodo;
            size++;
        } else {
            nodo.setPreviousElement(tail);
            tail.setNextElement(nodo);
            tail = nodo;
            size++;
        }
    }

    public Object popHead() {
        if(empty() == true){
            return null;
        }
        Nodo cabeza = head;
        head = cabeza.getNextElement();
        head.setPreviousElement(null);
        size--;
        return cabeza.getValue();
    }

    public Object popTail() {
      if (empty()) {
          return null;
      }     
      Nodo reserva = new Nodo(tail.getValue());
      tail = tail.getPreviousElement();
      tail.setNextElement(null);
      size--;
      return reserva.getValue();
    }

    public Object peekHead() {
        return head.getValue();
    }

    public Object peekTail() {
            return tail.getValue();
    }

    public boolean remove(int pos) {
        if (pos==0){
            popHead();
            return true;
        }
        else if(pos==size-1){
            popTail();
            return true;
        }else if (pos<size-1 && pos>0) {
        	Nodo temp = head;
        for(int i = 0; i<pos-1;i++) 
        	temp = temp.getNextElement();
        
        temp.setNextElement(new Nodo(obj,temp.getNextElement(),temp));
        	size++;
        	return true;
        }
        	return false;
    }

    public void remove(Object obj) {

    }

    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();
        System.out.println(lista.empty());
        Persona p1 = new Persona("Sergio", 20,"1234");
        Persona p2 = new Persona("Fran", 23,"235246");
        Persona p3 = new Persona("Marina", 14,"12457563");
        Persona p4 = new Persona ("Yoshi",34,"34234");
        
        lista.pushHead(p1);
        lista.pushHead(p2);
        lista.pushHead(p3);
        lista.insert(1, p4);
        System.out.println(lista.popHead());
       System.out.println(lista.peekHead()); 
        System.out.println(lista.peekTail());
        System.out.println(lista.size());
    }

}