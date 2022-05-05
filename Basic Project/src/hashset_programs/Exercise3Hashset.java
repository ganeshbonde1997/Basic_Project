package hashset_programs;
// write a program to create hashmap and iterate it and get the size

import java.util.HashSet;
import java.util.Iterator;

public class Exercise3Hashset {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
         h_set.add("violet");
         Iterator<String> i=h_set.iterator();
         while (i.hasNext()) {
        	 System.out.println("The elements in Hashset :" + i.next() );
         }
         System.out.println("The size of the hashset is :"+ h_set.size());
        		 }
}	
