import java.util.*;

public class MethodsDemo {
public static void main(String[] args) {
	Collection<Integer> list1=new ArrayList<Integer>(5);
	Collection<Integer> liss1=new ArrayList<Integer>();
	list1.add(15);
	list1.add(20);
	list1.add(25);
	System.out.println("The first List is ="+list1);
	
	liss1.add(78);
	liss1.add(9);
	liss1.add(8);
	list1.addAll(liss1);
	Iterator<Integer> itr= list1.iterator();
	while(itr.hasNext()) {
	Integer I= (Integer) itr.next();
//	while(I.SI) {
	System.out.println(I);
	}
}}
	
	/*System.out.println("The overall List is =" +list1);
	boolean result = list1.contains(20);
	System.out.println(result);	
	
}
}
*/