package Set_Interface.TreeSet;
// implements navigableset interface
// contains unique elements like HashSet
// access and retrieval time is very fast
// maintains ascending order
// null value not allowed
// only allow those generic type that are comparable

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("zebra");
        set.add("rabbits");
        set.add("tiger");
        set.add("elephant");

        /*for (String s : set) {
            System.out.println(s);
        }  */
        System.out.println(set);
        System.out.println(set.descendingSet());
        System.out.println(set.remove("zebra"));
        System.out.println(set.add("cat"));
        System.out.println(set.add("dog"));
        System.out.println(set);
        System.out.println(set.pollFirst()); // removes first element
        System.out.println(set.pollLast()); // removes last element
        System.out.println(set);
    }
}
