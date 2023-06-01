package Map_Interface.HashMap;
// map contains key-value pair
// map contains unique keys
// map is useful when u need to manipulate on basis of key
// two interface for implementing map ->Map and SortedMap
// three clases -> hashmap,treemap,linkedhashmap
// map doesnt duplicate keys but allows duplicate values
// hashmap and linkedhashmap allows null key and value but treemap dont

//

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
// map cannot be traversed so u need to convert it into set using keySet() or entrySet()
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(14,"cat");
        map.put(12,"lion");
        map.put(13,"dog");
        map.put(15,"tiger");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " +m.getValue());
        }

       map.put(16,"deer");
        System.out.println(map);

        map.putIfAbsent(17,"camel");
        System.out.println(map);

        map.remove(13);
        map.remove("lion");
        map.remove(15,"tiger");
        System.out.println(map);

        map.replace(16,"tiger");
        System.out.println(map);



    }
}
