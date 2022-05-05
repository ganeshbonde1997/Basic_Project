import java.util.TreeSet;
//Write a Java program to create a new tree set, and print out the tree set with first element and last element.
public class TreeSetEg {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Kunal");
        ts.add("Sahil");
        ts.add("Vinod");
        ts.add("Aditya");
        ts.add("Shubham");
        ts.add("Ajay");
        System.out.println("TressSet: ");
        System.out.println(ts);
        Object first_element = ts.first();
        System.out.println("First element of the treeset : "+ first_element);
        Object last_element = ts.last();
        System.out.println("Last element of the treeset: "+last_element);

    }
}
