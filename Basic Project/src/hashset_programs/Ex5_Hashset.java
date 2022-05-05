package hashset_programs;

import java.util.HashSet;

public class Ex5_Hashset {
	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
         System.out.println("Elements in Hashset :"+ h_set);
         h_set.removeAll(h_set);
         System.out.println("After removing the :"+h_set);
	}

}
