package edu.upc.eetac.dsa.cues;

public class FullQueueException extends Exception{
    public FullQueueException(){
        super("La cola esta llena!!!");
    }

    public void toString(String msg) {
        System.out.println(msg);
    }
}
