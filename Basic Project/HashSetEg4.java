import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSetEg4 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Kunal");
        hs.add("Rohit");
        hs.add("Sahil");
        hs.add("Vinod");
        hs.add("Aditya");
        System.out.println("Original Hashset" +hs);
        Set<String> tree_set = new TreeSet<String>(hs);

        //Display TreeSet Elements
        System.out.println("Treeset elements: ");
        for(String element : tree_set){
            System.out.println(element);
        }

    }
}
