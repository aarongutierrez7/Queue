package edu.upc.eetac.dsa.cues;

public class QueueImpl<E> implements Queue<E> {
    private E[] data;
    private int pos;

    public QueueImpl (int len){
        this.data = (E[])new Object[len];
        this.pos = 0;
    }
    @Override
    public void push(E o) throws FullQueueException {
        if (this.isFull())
            throw new FullQueueException();
        this.data [this.pos++] = o;
    }
    @Override
    public E pop() throws EmptyQueueException {
        if(this.isEmpty())
            throw new EmptyQueueException();
        E ret = this.data[0];
        E ultimo = this.data[this.pos];
        for (int i=0; i<this.pos-1; i++) {
            this.data[i] = this.data[i+1];
        }
        ultimo = this.data[0];
        this.pos--;
        return ret;
    }

    @Override
    public int size() {
        return this.data.length;
    }

    private boolean isFull() { return this.pos >= this.data.length; }

    private boolean isEmpty() {return this.pos == 0;}
}
