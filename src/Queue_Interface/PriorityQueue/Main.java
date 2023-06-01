package Queue_Interface.PriorityQueue;

import java.util.PriorityQueue;

// element with less value is given higher value

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("dog");
        pq.add("rabbits");
        pq.add("elephants");
        pq.add("cat");
        pq.add("lion");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.size());
        System.out.println(pq.element());

    }
}
