import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        List<String> AL = new ArrayList<String>();
        AL.add("Kiran");
        AL.add("Aditya");
        AL.add("Swapnil");
        AL.add("Sahil");
        AL.add("Vinod");


        Collections.shuffle(AL);
        System.out.println(AL);
    }
}
