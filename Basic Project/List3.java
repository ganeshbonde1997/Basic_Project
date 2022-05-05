import java.util.ArrayList;
import java.util.List;
//update element in the list
public class List3 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Black");
        color.add("Green");
        color.add("Yellow");
        color.add("Pink");
        System.out.println(color);
        //Setting the already exists element in the llist
        color.set(2, "Brown");
        System.out.println(color);
        //To remove an element
        color.remove(4);
        System.out.println("After removing the element " + "/n"+ color);

    }
}
