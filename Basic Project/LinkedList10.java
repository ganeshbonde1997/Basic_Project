import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList10 {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<String>();
        color.add("Pink");
        color.add("Red");
        color.add("Green");
        color.add("Yellow");
        color.add("Blue");
        color.add("White");
        System.out.println("Original Linked List" +color);

        List<String> list = new ArrayList<String>(color);

        for(String str: list){
            System.out.println(str);
        }
    }
}
