package hashmapDemo;
import java.util.Collections;
// program to associate the specified value with the specified key in a HashMap.
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex1_HashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1,"Narendra");
		hm.put(2,"Dharmraj");
		hm.put(3,"Anant");
		hm.put(4,"Ganesh");
		//System.out.println(hm);
		for(Map.Entry<Integer,String> x:hm.entrySet()){  
			   System.out.println(x.getKey()+" "+x.getValue());
			  
		}
	}  
	}
