package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//converting array to arraylist
public class ArrayEx6 {
    public static void main(String[] args) {
        //create an array
        String a[] = {"Java, Python, ADS"};
        System.out.println("Array elements" + Arrays.toString(a));
        //convert to arraylist
        List Languages = new ArrayList<>(Arrays.asList(a));
        System.out.println("List : " + Languages);

    }
}
