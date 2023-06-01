package List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {
    public static void main(String[] args) {
        String[] arr = {"DOG","CAT","RABBITS","PENGUIN"};
        System.out.println("printing array " + Arrays.toString(arr));

        List<String> list = new ArrayList<String>();
        for(String animals : arr) {
            list.add(animals);
        }
        System.out.println("printing list " +list);


    }
}
