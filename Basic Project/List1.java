import java.util.ArrayList;
import java.util.List;
//Write a Java program to iterate through all elements in an array list.

public class List1 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Purple");
        color.add("Brown");
        color.add("Black");

        for(String element : color){
            System.out.println(element);
        }
    }
}
