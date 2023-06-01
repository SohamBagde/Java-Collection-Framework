package Deque_Interface.ArrayDeque;
// deque is subtype of queue interface
// supports manipulation at both ends
// lifo
// deque can also be used as stack

// Deque is interface and we know we cannot create object of interface.thus for instantiation
// we need class that implements interface -> ArrayDeque

// null elements are not allowed
// faster than ll and stack

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("dog");
        deque.add("rabbit");
        deque.add("cat");
        deque.add("elephant");
        deque.add("tiger");

        System.out.println(deque);

        deque.offer("lion");
        deque.offerFirst("crocodile");
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
