package Set_Interface.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cat");
        list.add("dog");

        HashSet<String> set = new HashSet<>(list);
        set.add("rabbits");
        set.add("elephants");

        for(String animals : set) {
            System.out.println(animals);
        }
    }
}
