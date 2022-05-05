import java.util.HashSet;
//Write a Java program to get the number of elements in a hash set and removing all elements
public class HashSetEg2 {
    public static void main(String[] args) {
        //Write a Java program to get the number of elements in a hash set
        HashSet<String> hs = new HashSet<String>();
        hs.add("Kunal");
        hs.add("Sanjay");
        hs.add("Vijay");
        hs.add("Sahil");
        hs.add("Virendra");
        System.out.println("Orginal hash set" + hs);
        System.out.println("The size of hash set is :" +hs.size());
        hs.removeAll(hs);
        System.out.println("After removing all elements in the hash set" +hs);
        //Check whether set is empty or not
        hs.isEmpty();
        System.out.println("Checking whether the hash set empty or not : " + hs);

    }
}
