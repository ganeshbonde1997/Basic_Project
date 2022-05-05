package hashmapDemo;
import java.util.HashMap;
import java.util.Map;

// Write a Java program to count the number of key-value (size) mappings in a map. 
public class Ex2_HashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Narendra");
		hm.put(2,"Ravindra");
		hm.put(3,"Shubham");
		hm.put(4,"Krushna");
		
		for(Map.Entry<Integer,String> s:hm.entrySet()) {
			System.out.println(s.getKey()+"   "+s.getValue());
		}
		
	}

}
