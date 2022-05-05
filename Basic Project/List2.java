
import java.util.ArrayList;
import java.util.List;
//Adding element in existing List
public class List2 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Black");
        color.add("Purple");
        color.add("Pink");
        color.add("Brown");
        System.out.println(color);
        //Adding an elment in the above list
        color.add(0, "Yellow");
        color.add(6, "Blue");
        System.out.println(color);
    }
}
