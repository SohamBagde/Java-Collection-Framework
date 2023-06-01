package List_Interface.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Book {
    String name;
    String author;
    int quantity;
    Book(String name,String author,int quantity) {
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
}
class Work {
    public static void main(String[] args) {
        List<Book> list = new LinkedList<Book>();
        Book book1 = new Book("messi" , "antony",2);
        Book book2 = new Book("lunin" , "sunny",1);
        Book book3 = new Book("mars" , "david",4);

        list.add(book1);
        list.add(book2);
        list.add(book3);

        for (Book b : list) {
            System.out.println(b.author + " " + b.name + " " + b.quantity);
        }

        Iterator it = list.iterator();
        /*
        while (it.hasNext()) {
            Book b = (Book)it.next();
            System.out.println(b.author + " " + b.name + " " + b.quantity);
        } */

    }
}
