import java.util.HashSet;

//Write a Java program to convert a hash set to an array
public class HashSetEg3 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Kunal");
        hs.add("Rohit");
        hs.add("Sahil");
        hs.add("Vinod");
        hs.add("Aditya");
        System.out.println("Original HashSet : "+ hs);
        String[] arr = new String[hs.size()];
        hs.toArray(arr);
        System.out.println("After converting the hashset to array :");
        for(String elements : arr){
            System.out.println(elements);
        }
    }
}
