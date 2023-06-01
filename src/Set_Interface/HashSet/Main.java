package Set_Interface.HashSet;
// uses hash table for storage
// uses hashing to store elements
// contains unique elements
//allows null value
// doesnt maintain insertion order
// hence elements are inserted on basis of their hashcode
//

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("fourth");
        set.add("fourth");

        Iterator it = set.iterator();
       /*while(it.hasNext()) {
            System.out.println(it.next());
         }  */
        for(String num : set) {
            System.out.println(num);
        }
        System.out.println(set.contains("fourth"));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.remove("two"));
        System.out.println(set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("messi");
        set1.add("neymar");
        set1.add("ronaldo");

        set.addAll(set1);
        System.out.println(set); // adding set1 into set
        set.removeAll(set1);
        System.out.println(set); // removing set1 elements fom set
        set.addAll(set1);



    }
}
