package Set_Interface.TreeSet;

import java.util.TreeSet;

public class NavigableSetOperations {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("initial set " +set);
        System.out.println("reverse set " +set.descendingSet());
        System.out.println("Head set " +set.headSet("C",true));
        System.out.println("Head set2 " +set.headSet("C"));
        System.out.println("Tail set " +set.tailSet("D"));
        System.out.println("Tail set2 " +set.tailSet("D",false));
        System.out.println("Sub set " +set.subSet("A","D"));
        System.out.println("Sub set2 " +set.subSet("A",false,"D",true));
    }
}
