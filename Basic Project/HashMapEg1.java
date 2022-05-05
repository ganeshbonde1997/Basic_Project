import java.util.HashMap;

public class HashMapEg1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(12, "Kunal");
        hm.put(13, "Sahil");
        hm.put(14,"Vinod");
        hm.put(15,"Vijay");
        hm.put(16,"Ajay");
        System.out.println("Size of the Hashmap : " +hm.size());
    }
}
