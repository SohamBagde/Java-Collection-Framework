package Set_Interface.TreeSet;
// elements in the treeset must be of a comparable type
// to add user defined objects in treeset,we need to implement comparable interface
// String and Wrapper are comparable by default


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book>{
    int id;
    int quantity;
    Integer sales;
    String name;
    String author;

    Book(String name,int quantity,int id,Integer sales) {
     this.name = name;
     this.quantity = quantity;
     this.id = id;
     this.sales = sales;
    }

   /* public int compareTo(Book b) {
        if(quantity > b.quantity) {
            return 1;
        } else if (quantity < b.quantity) {
            return -1;
        }
        else {
            return 0;
        }
    } */
    public int compareTo(Book b) {
        return Integer.compare(this.id,b.id);
    }

}

class Work {
    public static void main(String[] args) {
        Set<Book> set = new TreeSet<Book>();
        Book b1= new Book("shell" , 12,32,123);
        Book b2= new Book("crowm" , 31,233,3211);
        Book b3= new Book("alpha" , 1,21,11);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for(Book b : set) {
            System.out.println(b.name + " " + b.quantity + " " + b.id + " " +b.sales);
        }
    }
}
