import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List5 {
    public static void main(String[] args) {
    List<String> List = new ArrayList<String>();
    List.add("A");
    List.add("B");
    List.add("C");
    List.add("D");
    List.add("E");
    System.out.println(List);

    List<String> List1= new ArrayList<String>();

    List1.add("1");
    List1.add("2");
    List1.add("3");
    List1.add("4");
    List1.add("5");

    System.out.println(List1);
    Collections.copy(List, List1);
        System.out.println("After Copying the element into the another list");
        System.out.println("List :" + List);
        System.out.println("List1:" + List1);
    }
}
