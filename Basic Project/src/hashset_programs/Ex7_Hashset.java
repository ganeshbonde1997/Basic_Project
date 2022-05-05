package hashset_programs;

import java.util.HashSet;
// program to convert hashset into the array
public class Ex7_Hashset {
	public static void main(String[] args) {
		HashSet<String> h_set=new HashSet<String>();
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
         System.out.println("orignal Hashset :"+h_set);
         h_set.add("abc");
         String [] arr=new String[h_set.size()];
         h_set.toArray(arr);
			/*
			 * System.out.println(h_set); for (int i=0;i<arr.length;i++) {
			 * System.out.println(arr); }
			 */
         for(String element: arr) {
        	 System.out.println(element);
         }
	}
}