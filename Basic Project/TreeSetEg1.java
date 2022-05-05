import java.util.TreeSet;
//Write a Java program to iterate through all elements in a tree set
public class TreeSetEg1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Kunal");
        ts.add("Sahil");
        ts.add("Vinod");
        ts.add("Aditya");
        ts.add("Shubham");
        ts.add("Ajay");
        for(String elements : ts){
            System.out.println(ts);
            break;
        }
    }
}
