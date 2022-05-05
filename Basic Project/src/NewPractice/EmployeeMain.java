package NewPractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList();
		list.add(new Employee(1, "Ganesh", "ganesh@gmail.com", 800));
		list.add(new Employee(8, "Vaibho", "dattewadi@gmail.com", 200));
		list.add(new Employee(12, "Vishal", "xyz@gmail.com", 300));
		list.add(new Employee(4, "Anant", "anant@gmail.com", 400));
		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) 
		{
		System.out.println(itr1.next());
		}
		System.out.println(" After the sorting ");
		Collections.sort(list, new IdComparator());
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
