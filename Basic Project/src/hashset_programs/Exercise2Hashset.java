package hashset_programs;
// program to create hashset and iterate it

import java.util.HashSet;
import java.util.Iterator;

public class Exercise2Hashset {
	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("abc");
		hs.add("ravindra");
		hs.add("krushna");
		hs.add("narendra");
		hs.add("Error");
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
