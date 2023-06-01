package Set_Interface.LinkedHashSet;
//inherits hashset class and implements set interface
// contains unique elements
// maintains insertion order unlike hashset
//allows null elements

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("dog");
        set.add("cat");
        set.add("rabbits");
        set.add("elephant");



        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        set.isEmpty();
        set.remove("dog");
        System.out.println(set);

    }

}
