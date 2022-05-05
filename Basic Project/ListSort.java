import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Yellow");
        color.add("Cyan");
        color.add("Purple");
        color.add("Brown");
        color.add("Green");
        System.out.println("Before sorting the element in the List" + color);
        Collections.sort(color);
        System.out.println("After sorting the element in the List" + color);

    }
}
