package List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListtoArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("india");
        list.add("holland");
        list.add("aus");

        String[] arr= list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arr));
    }
}
