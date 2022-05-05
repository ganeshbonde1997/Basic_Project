package NewPractice;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList_D {
	public static void main(String[] args) {
		ArrayList<String> l= new ArrayList<String>();
		l.add("2");
		l.add("3");
		l.add("5");
		
		TreeSet<String> s= new TreeSet<String>(l);
		System.out.println(s);
		System.out.println(s.getClass());
		 for(String str:l) {
			 System.out.println(l);
		 }
		
	}

}
