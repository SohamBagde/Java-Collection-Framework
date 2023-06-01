package List_Interface.ArrayList;
// Arraylist uses dynamic array
// maintains insertion order
// inherits AbstractList class and implements List interface
// allows random access

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Fruits {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] arr = {"banana","apple","grapes","mango"};
        int i=0;
        while(i<arr.length) {
            list.add(arr[i]);
            i++;
        }
        // System.out.println(list);

        System.out.println(list.get(1));
        list.set(2,"pineapple");
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        System.out.println(list.contains("banana"));
        System.out.println(list);
        System.out.println(list.indexOf("mango"));
       list.remove("pineapple");
        System.out.println(list);
        System.out.println(list.size());


        //2. traversing using iterator interface
        Iterator it = list.iterator();
        //while(it.hasNext()) {
         //   System.out.println(it.next());
        //}

        //3. using for-each loop
       /* for(String fruit : list) {
            System.out.println(fruit);
        }  */
        Collections.sort(list);
        System.out.println(list);
        list.set(0,"pineapple");
        System.out.println(list);

    }
}
