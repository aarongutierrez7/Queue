package edu.upc.eetac.dsa.cues;

public class Main {

    public static void main(String[] args) {

        QueueImpl<String> numQ = new QueueImpl(4);

        try {
            numQ.push("Aaron");
            numQ.push("Pep");
            numQ.push("Lluis");



            System.out.println("Hi han "+numQ.size()+" posicions en total a la cua.");
        } catch (FullQueueException e) {
            e.toString("cola llena");
        }

        String o1 = "";
        try {
            o1 = numQ.pop();
        } catch (EmptyQueueException e) {
            e.toString("cola vacia");
        }
        String o2 = "";
        try {
            o2 = numQ.pop();
        } catch (EmptyQueueException e) {
            e.toString("cola vacia");
        }
        String o3 = "";
        try {
            o3 = numQ.pop();
        } catch (EmptyQueueException e) {
            e.toString("cola vacia");
        }
        String o4 = "";
        try {
            o4 = numQ.pop();
        } catch (EmptyQueueException e) {
            e.toString("cola vacia");
        }
        try {
           numQ.pop();
            numQ.pop();
        } catch (EmptyQueueException e) {
            e.toString("cola vacia");
        }
        System.out.println("L'element agafat de la cua es "+o1);
        System.out.println("L'element agafat de la cua es "+o2);
        System.out.println("L'element agafat de la cua es "+o3);
        System.out.println("L'element agafat de la cua es "+o4);
        System.out.println(numQ.size());

    }
}
