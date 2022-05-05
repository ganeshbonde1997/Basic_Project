import java.util.ArrayList;
import java.util.List;

//To search an element in list
public class List4 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Black");
        color.add("Yellow");
        color.add("Green");
        color.add("Cyan");
        color.add("Purple");
        if(color.contains("purple")){
            System.out.println("element found in list");
        }
        else{
            System.out.println("Element not found in the List");
        }

    }
}
