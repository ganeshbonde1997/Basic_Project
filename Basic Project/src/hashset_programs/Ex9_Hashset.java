package hashset_programs;
// program to compare two hashsets

import java.util.HashSet;

public class Ex9_Hashset {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         
         HashSet<String> h=new HashSet<String>();
         h.add("Red");
         h.add("maroon");
         h.add("Black");
         
         HashSet<String> h1=new HashSet<String>();
         for(String s:h_set) {
        	 System.out.println(h.contains(s)? "Yes":"No");
         }
         
        
        // System.out.println("orignal Hashset :"+h_set);
         
}
}