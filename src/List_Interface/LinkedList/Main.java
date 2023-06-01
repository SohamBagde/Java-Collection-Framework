package List_Interface.LinkedList;
// ll uses a doubly linked list
//inherit AbstractList class and implements list and deque interface
//non synchronized
//manipulation is faster than AL coz no shifting needs to occur
// can be used as stack,queue,list

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        String[] arr = {"football","cricket","hockey"};
        int i=0;
        while(i< arr.length) {
            list.add(arr[i]);
            i++;
        }
        list.add("baseball");

     //   System.out.println(list);

        //traversing using iterator
       /* Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        } */
        System.out.println(list);
        list.add(0,"carrom");
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("snooker");
        list2.add("ice-hockey");
        list2.add("kabaddi");

        System.out.println(list2);
        System.out.println(list);
        list.addAll(list2); // wil get added at the end
        System.out.println(list);

        LinkedList<String> list3 = new LinkedList<String>();
        list3.add("kho-kho");
        list3.add("poker");

        list.addAll(1,list3); // add from particular index
        System.out.println(list);
        list.addFirst("RACING");
        list.addLast("gaming");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        list.add("kabaddi");
        System.out.println(list);
        list.removeFirstOccurrence("kabaddi");
        System.out.println(list);

     // reverse list of elements
        Iterator it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
