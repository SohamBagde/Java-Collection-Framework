package Queue_Interface.PriorityQueue;
// elements in pq must be of comprable type
// string and wrapper classes are comprable by default

import java.util.PriorityQueue;
import java.util.Queue;

public class Book implements Comparable<Book>{
    String name;
    String author;
    int quantity;
    Book(String name, String author, int quantity) {
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.quantity,o.quantity);
    }
}
class Work {
    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<Book>();
        Book b1 = new Book("dog" , "amer",12);
        Book b2 = new Book("life" , "dawid",1222);
        Book b3 = new Book("world" , "john",7);

        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        for (Book b : queue) {
            System.out.println(b.name + " " + b.quantity + " " + b.author);
        }
        queue.remove();
        for (Book b : queue) {
            System.out.println(b.name + " " + b.quantity + " " + b.author);
        }

    }
}
