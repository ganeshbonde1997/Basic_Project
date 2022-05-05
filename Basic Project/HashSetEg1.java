import java.util.HashSet;
import java.util.Iterator;
//Write a Java program to iterate through all elements in a hash list.
public class HashSetEg1 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Kunal");
        h.add("Rohit");
        h.add("Sahil");
        h.add("Vinod");
        h.add("Aditya");
        //Set iterator
        Iterator<String> p = h.iterator();
        //Iterate the hashset
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
