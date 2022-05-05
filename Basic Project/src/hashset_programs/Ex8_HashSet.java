package hashset_programs;
// program to convert hashset to arraylist

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Ex8_HashSet {
	public static void main(String[] args) {
			HashSet<String> h_set=new HashSet<String>();
			 h_set.add("Red");
	         h_set.add("Green");
	         h_set.add("Black");
	         h_set.add("White");
	         h_set.add("Pink");
	         h_set.add("Yellow");
	         System.out.println("orignal Hashset :"+h_set);
	        ArrayList<String> h_List=new ArrayList<String>(h_set);
	         System.out.println(h_List);
	         System.out.println(h_List.getClass());
	         
	         
	}
	

}
