package edu.upc.eetac.dsa.cues;

public class EmptyQueueException extends Exception{

    public EmptyQueueException(){
        super("La cola esta vacia!!!");
    }

    public void toString(String msg) {
        System.out.println(msg);
    }
}
