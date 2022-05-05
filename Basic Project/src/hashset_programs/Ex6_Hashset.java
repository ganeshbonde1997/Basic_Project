package hashset_programs;
// program to clone hashset into the another

import java.util.HashSet;

public class Ex6_Hashset {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
         System.out.println("orignal Hashset :"+h_set);
         HashSet n_hset=new HashSet();
         n_hset=(HashSet)h_set.clone();
         n_hset.add("Ganesh");
         System.out.println("Clone collection :"+n_hset);
         for (String s : h_set) {
        	 System.out.println(s);
         }
	}

}
