package SortedMap_Interface.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// non-synchronized
// maintains ascending order

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        map.put(2,"cat");
        map.put(4,"lion");
        map.put(1,"dog");
        map.put(5,"tiger");

        map.remove(14);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " +m.getValue());
        }

        map.putIfAbsent(3,"rabbit");
        System.out.println(map.descendingMap()); // in descending order
        System.out.println(map.headMap(3,true));
        System.out.println(map.headMap(3));
        System.out.println(map.tailMap(3));
        System.out.println(map.subMap(2,true,4,false));
    }
}
