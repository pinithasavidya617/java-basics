package Day8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class main {

    public static void main(String[] args) {

//        linkedList();
//        linkedListQueue();
//        arrayDeque();
        blockingQueue();
    }

    public static void linkedList() {

        LinkedList<String> names = new LinkedList<>();   // code to the linkedList interface
        names.offer("Kavindu");
        names.offer("ranil");
        names.offer("amal");

        names.add("aruna");

        System.out.println(names);
        System.out.println(names.get(1));
    }

    public static void linkedListQueue() {

        Queue<String> names = new LinkedList<>();   // code to the queue interface
        names.offer("Kavindu");
        names.offer("ranil");
        names.offer("amal");

        names.add("aruna");

        System.out.println(names);
        // System.out.println(names.get(1));  // get cannot use in queue
        System.out.println(names.poll());  // retrieves the first element queue and removes it
        System.out.println(names);
    }

    public static void arrayDeque() {

        Deque<String> kottuOrders = new ArrayDeque<>();

        kottuOrders.offer("kavindu's order");
        kottuOrders.offer("amal's order");

        kottuOrders.addFirst("agith's order");

        System.out.println(kottuOrders);
        System.out.println(kottuOrders.peek());
        System.out.println(kottuOrders.peekLast());
        System.out.println(kottuOrders.removeFirst());
        System.out.println(kottuOrders.poll());
    }

    public static void blockingQueue() {

        ArrayBlockingQueue<String> appointments = new ArrayBlockingQueue<>(5);

        appointments.offer("patient 1");
        appointments.offer("patient 2");
        appointments.offer("patient 3");
        appointments.offer("patient 4");
        appointments.offer("patient 5");

        appointments.offer("patient 6"); // can't add

        System.out.println(appointments);

        while (!appointments.isEmpty()) {
            System.out.println("Processing queue - " + appointments.poll());
        }

        System.out.println(appointments);
    }
}