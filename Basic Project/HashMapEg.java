import java.util.HashMap;
import java.util.Map;

public class HashMapEg {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(12, "Kunal");
        hm.put(13, "Sahil");
        hm.put(14,"Vinod");
        hm.put(15,"Vijay");
        hm.put(16,"Ajay");
        for(Map.Entry x: hm.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
