package Map_Interface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Book {
    int id;
    String name;
    String author;

    Book(int id,String name,String author) {
        this.id = id;
        this.name =name;
        this.author = author;
    }
}

class Work {
    public static void main(String[] args) {
        Map<Integer,Book> map = new HashMap<Integer,Book>();

        Book b1 = new Book(23,"world","john");
        Book b2 = new Book(213,"job","tom");
        Book b3 = new Book(13,"camp","aj");
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        for(Map.Entry<Integer,Book> m : map.entrySet()) {
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(b.author + " " + b.name + " " +b.id);
        }
    }
}
