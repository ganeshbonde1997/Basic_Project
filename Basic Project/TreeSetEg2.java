import java.util.Iterator;
import java.util.TreeSet;
//Write a Java program to create a reverse order view of the elements contained in a given tree set
public class TreeSetEg2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Kunal");
        ts.add("Sahil");
        ts.add("Vinod");
        ts.add("Aditya");
        ts.add("Shubham");
        ts.add("Ajay");
        System.out.println("Original TreeSet : "+ts);
        Iterator it = ts.descendingIterator();
        System.out.println("Elements in Reverse Order : ");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
