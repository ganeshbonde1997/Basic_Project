import java.util.HashSet;
//Write a Java program to compare two sets and retain elements which are same on both sets.
public class HashSetEg5 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Sahil");
        hs.add("Kunal");
        hs.add("Aditya");
        hs.add("Vinod");
        hs.add("Jay");
        System.out.println("First HashSet" +hs);
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("Hrutwik");
        hs1.add("Kunal");
        hs1.add("Sahil");
        hs1.add("Vinod");
        hs1.add("Yogesh");
        System.out.println("Second Hashset" +hs1);
        hs.retainAll(hs1);
        System.out.println("HashSet after sorting by common name" + hs);

    }
}
