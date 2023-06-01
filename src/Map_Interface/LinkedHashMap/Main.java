package Map_Interface.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// maintains insertion order
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
        map.put(14,"cat");
        map.put(12,"lion");
        map.put(13,"dog");
        map.put(15,"tiger");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.remove(13);
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
